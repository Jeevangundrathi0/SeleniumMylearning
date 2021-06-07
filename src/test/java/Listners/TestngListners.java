package Listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.Credentials;
import resources.extentReports;

public class TestngListners extends Credentials implements ITestListener {

	ThreadLocal<ExtentTest> extentTests = new ThreadLocal<ExtentTest>();
	ExtentReports extent = extentReports.getExtentReports();
	ExtentTest testReport;

	@Override
	public void onTestStart(ITestResult result) {

		testReport = extent.startTest(result.getMethod().getMethodName());
		extentTests.set(testReport);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTests.get().log(LogStatus.PASS, "Test case passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		WebDriver driver = null;

		String methodName = result.getMethod().getMethodName();

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			screenshots(methodName, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();

	}

}
