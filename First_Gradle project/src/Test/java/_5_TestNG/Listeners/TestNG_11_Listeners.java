package _5_TestNG.Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomerListeners.class)  //or we can start it from testng.xml
@Listeners(CustomerListeners.class)

public class TestNG_11_Listeners {
    @Test
    void passTest1(){
        System.out.println("Test1 passed");
    }

    @Test
    void failTest2(){
        System.out.println("Test2 failed");
        Assert.assertEquals("a","b");
    }

    @Test
    void skippedTest3(){
        System.out.println("Test skipped");
        throw new SkipException("This is skipped");
    }


}
