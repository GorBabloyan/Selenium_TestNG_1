package _2_ACA_Homvork._4;

public class DateTest {


    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 1898;

        ///Year Test


        ///Month Test
        int counterMonth = 0;
        for (int i = 0; i < 14; i++) {
            Date date = new Date(1, month, 2000);
            month++;
            if (!date.isTrue) {
                counterMonth++;
            }
        }
        if (counterMonth > 2) {
            System.out.println("Test fail");
        }
        System.out.println("Counter = " + counterMonth);

        ////Day Test
        int counterDay = 0;
        for (int i = 0; i < 31; i++) {
            Date date = new Date(day, 1, 2000);
            day++;
            if (!date.isTrue) {
                System.out.println("Test fail");
                break;
            }
        }


    }
}
