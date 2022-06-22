package _5_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNg {
    @Test
    void v1() {
        System.out.println("XXX");
        Assert.assertEquals(1,1);
    }


    @Test
    void v() {
        System.out.println("XXX");
    }
}
