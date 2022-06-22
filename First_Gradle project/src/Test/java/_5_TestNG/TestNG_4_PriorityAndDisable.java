package _5_TestNG;

import org.testng.annotations.Test;

public class TestNG_4_PriorityAndDisable {

    @Test(priority = 0)
    void testOne(){
        System.out.println("This is test one");
    }

    @Test(priority = 2,enabled = false)
    void testTwo(){
        System.out.println("This is test two");
    }

    @Test(priority = 3)
    void testThree(){
        System.out.println("This is test three");
    }

    @Test(priority = 4,enabled = false)
    void testFour(){
        System.out.println("This is test four");
    }








}
