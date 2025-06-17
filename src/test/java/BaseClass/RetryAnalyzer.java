package BaseClass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0 ;
    private final int  maxCount = 3;
    @Override
    public boolean retry(ITestResult result) {
        if(retryCount < maxCount)
        {
            retryCount ++;
            return true;
        }
        return false;
    }
}
