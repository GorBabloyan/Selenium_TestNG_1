package _5_TestNG;

import org.testng.annotations.DataProvider;

public class TestNG_9_1_CusstomerDataProvider {
    @DataProvider(name = "loginDataProvider")
    public Object [][] getData(){
        Object data[][] = {{"abc@mail.ru","abc", "Gor"},{"xyz@mail.ru","xyz",null},{"mno@mail.ru","mno", "Mno"}};
        return data;
    }
}
