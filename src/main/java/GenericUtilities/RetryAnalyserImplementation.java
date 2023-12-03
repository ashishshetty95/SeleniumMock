package GenericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementation implements IRetryAnalyzer {
	int limit=3;
	int count=1;
	@Override
	public boolean retry(ITestResult result) {
		
		if (count<=limit) {
			count++;
			return true;
		}
		return false;
	}
	
}
