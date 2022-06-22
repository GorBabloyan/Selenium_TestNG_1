package _1_ACA.Gorcnakan_1.MobileNumber;

public class Main_MobileNumber {
    public static void main(String[] args) {
        MobileNumber mn = new MobileNumber();
        mn.numberValidation("099010203");     //Valid Number with 099
        System.out.println(mn.isValid);
        mn.numberValidation("077010203");     //Valid Number with 077
        System.out.println(mn.isValid);
        mn.numberValidation("07701020304");   //InValid Number with more than 9 digits
        System.out.println(mn.isValid);
        mn.numberValidation("07701020");      //InValid Number with less than 9 digits
        System.out.println(mn.isValid);
        mn.numberValidation("507701020");     //InValid Number that don't start with 077 or 099
        System.out.println(mn.isValid);
        mn.numberValidation("077absabs");     //InValid Number that contains symbolises
        System.out.println(mn.isValid);

    }
}
