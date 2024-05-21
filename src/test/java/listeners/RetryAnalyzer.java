package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int countOfRetries = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        int maxNumberOfRetries = 3;
        if(!iTestResult.isSuccess() && countOfRetries < maxNumberOfRetries) {
            countOfRetries++;
            return true;
        }
        return false;
    }
}
