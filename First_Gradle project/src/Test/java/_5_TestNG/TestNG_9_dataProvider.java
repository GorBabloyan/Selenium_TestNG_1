package _5_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_9_dataProvider {

    @Test(dataProvider = "loginDataProvider", dataProviderClass = TestNG_9_1_CusstomerDataProvider.class)     //If in this class we need to write dataProvider = "loginDataProvider"
    void logInTest(String mail, String password , String name){
        System.out.println(mail + " " + password + " " + name);
    }


   @DataProvider(name = "loginDataProvider")
   public Object [][] getData(){
        Object data[][] = {{"abc@mail.ru","abc", "Gor"},{"xyz@mail.ru","xyz",null},{"mno@mail.ru","mno", "Mno"}};
       return data;
    }
}
