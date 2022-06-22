package _5_TestNG;

import org.testng.annotations.*;

public class TestNG_3_1_BeforeAfter {
    @BeforeClass
    void beforeClass(){
        System.out.println("Before this class ...");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After this class ...");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before every method ...");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After every method ...");
    }


    @Test
    void test3(){
        System.out.println("Test three ...");
    }
    @Test
    void test4(){
        System.out.println("Test four ...");
    }

}
