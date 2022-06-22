package _5_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_5_DipendencyAndAlwaysRun {
    @Test
    void carStart(){
        Assert.fail();
        System.out.println("Car started");
    }

    @Test(priority = 2,dependsOnMethods = {"carStart"})
    void carDrive(){
        System.out.println("Car driving");
    }

    @Test(priority = 1,dependsOnMethods = {"carStart","carDrive"})
    void carStop(){
        System.out.println("Car stopped");
    }

    @Test(priority = 0, dependsOnMethods = {"carStop","carDrive"},alwaysRun = true)
    void carPark(){
        System.out.println("Car parked");
    }





}
