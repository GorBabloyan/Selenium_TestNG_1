package _1_ACA.Gorcnakan_1.MobileNumber;

import java.util.ArrayList;

public class MobileNumber {
    boolean isValid;

    void numberValidation(String number) {
        ArrayList num = new ArrayList();

            for (int i = 0; i < number.length(); i++) {
                num.add(i, number.charAt(i));

                if (num.get(i).equals('0') || num.get(i).equals('1') || num.get(i).equals('2') || num.get(i).equals('3') || num.get(i).equals('4') || num.get(i).equals('5') || num.get(i).equals('6') || num.get(i).equals('7') || num.get(i).equals('8') || num.get(i).equals('9')) {
                    isValid = true;
                } else {
                    isValid = false;
                    System.out.println(number + " This number isn't Valid because contains char symbol(symbols)");
                    break;
                }
            }



        if (number.length() == 9 && isValid) {
            String firstThree = number.substring(0, 3);
            if (firstThree.equals("077") || firstThree.equals("099")) {
                System.out.println(number + " This number is Valid");
                isValid = true;
            } else {
                System.out.println(number + " This number isn't Valid because it don't starting 077 or 099 ");
                isValid = false;
            }
        } else if (isValid) {
            System.out.println(number + " This number isn't Valid because contains more (less) then 9 digits");
            isValid = false;
        }
    }
}
