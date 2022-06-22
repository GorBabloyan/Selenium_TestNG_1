package _5_TestNG;

import org.testng.annotations.Test;

public class TestNG_6_Groups_Include_Exclude {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("This is test1 ....");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("This is test2 ....");
    }

    @Test(groups = {"regression"})
    void test3(){
        System.out.println("This is test3 ....");
    }

    @Test(groups = {"regression"})
    void test4(){
        System.out.println("This is test4 ....");
    }
    @Test(groups = {"sanity","regression"})
    void test5(){
        System.out.println("This is test5 ....");
    }

    @Test(groups = {"smoke"})
    void test6(){
        System.out.println("This is test6 ....");
    }




}
