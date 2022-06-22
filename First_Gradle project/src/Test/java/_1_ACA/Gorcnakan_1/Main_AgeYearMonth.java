package _1_ACA.Gorcnakan_1;

import java.time.LocalDate;

public class Main_AgeYearMonth {
    public static void main(String[] args) {
        LocalDate my_birthday = LocalDate.of( 1994, 5, 21 ) ;
        LocalDate date_now = LocalDate.now() ;

        AgeYearMonth aym = new AgeYearMonth(my_birthday,date_now);
        System.out.println(aym.calculateAll());
    }
}
