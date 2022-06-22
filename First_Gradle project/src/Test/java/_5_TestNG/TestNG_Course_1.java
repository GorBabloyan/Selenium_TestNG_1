package _5_TestNG;

import org.testng.annotations.Test;

public class TestNG_Course_1 {
    @Test(priority = 1)
    void open(){
        System.out.println("Web browser opened");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("We loge in");
    }
    @Test(priority = 3)
    void close(){
        System.out.println("Web browser closed");
    }
}
