package _5_TestNG.Listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomerListeners implements ITestListener
{

    public void onStart(ITestContext arg) {
        System.out.println("1_Test execution starts..." + arg.getName());
    }

    public void onFinish(ITestContext arg0) {
        System.out.println("2_Test execution finished..." + arg0.getName());
    }


    public void onTestStart(ITestResult arg1) {
        System.out.println("3_Test starts..." + arg1.getName());
    }


    public void onTestSuccess(ITestResult arg2) {
        System.out.println("4_Test execution Successes..." + arg2.getName());
    }

    public void onTestFailure(ITestResult arg3) {
        System.out.println("5_Test execution Failed..." + arg3.getName());
    }


    public void onTestSkipped(ITestResult arg4) {
        System.out.println("6_Test execution Skipped..." + arg4.getName());

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }
}
