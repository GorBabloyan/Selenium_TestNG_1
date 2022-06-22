package _5_TestNG;

import org.testng.annotations.*;

public class TestNg_3_BeforeAfterMethod {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite ...");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite ...");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Before test ...");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After test ...");
    }


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
    void test1(){
        System.out.println("Test one ...");
    }

    @Test
    void test2(){
        System.out.println("Test two ...");
    }


}
