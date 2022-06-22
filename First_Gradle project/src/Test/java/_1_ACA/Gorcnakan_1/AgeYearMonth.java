package _1_ACA.Gorcnakan_1;
import java.time.LocalDate;
public class AgeYearMonth {
    int date_now_Year;
    int date_now_Month;
    int date_now_day;
    int birthday_Year;
    int birthday_Month;
    int birthday_day;
    int year;
    int month;
    int day;

    AgeYearMonth(LocalDate date_now, LocalDate my_birthday){
    this.date_now_Year = date_now.getYear();
    this.date_now_Month = date_now.getMonth().ordinal();
    this.date_now_day = date_now.getDayOfMonth();

    this.birthday_Year = my_birthday.getYear();
    this.birthday_Month = my_birthday.getMonth().ordinal();
    this.birthday_day = my_birthday.getDayOfMonth();
    }

    int calculateYears (){
        this.year = this.birthday_Year-this.date_now_Year ;
        return  this.year;
    }
    int calculateMonths (){
        this.month =this.birthday_Month - this.date_now_Month ;
        return this.month;
    }
    int calculateDays (){
        this.day = this.birthday_day - this.date_now_day  ;
        return this.day;
    }

    String calculateAll(){
        calculateYears();
        calculateMonths();
        calculateDays();
        if (this.month<0){
            this.year = this.year - 1;
            this.month = 12 + this.month;
        }
        if (this.day<0){
            this.month = this.month - 1;
            this.day = 31 + this.day;
        }
        return  "you are  " + this.year +" year " + this.month +  " Month and " + this.day + " days old" ;
    }

}
