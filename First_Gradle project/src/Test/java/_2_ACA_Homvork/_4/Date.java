package _2_ACA_Homvork._4;

public class Date {
    private int day;
    private int month;
    private int year;
    public boolean isTrue;
    public Date(int day, int month, int year) {
        if (year > 2022 || year <= 1900) {
            System.out.println("Not valid year");
            display(false);
        } else if (month > 12 || month < 1) {
            System.out.println("Not valid month");
            display(false);
        } else if (day > 31 || day < 1) {
            System.out.println("Not valid day");
            display(false);
        } else if (month == 4  && day > 30 ||month == 6 && day > 30 || month == 9 && day > 30 || month == 11 && day > 30) {
            System.out.println("Not valid day");
            display(false);
        } else if (month == 2 && day > 28) {
            System.out.println("Not valid day");
            display(false);
        } else {
            setDay(day);
            setMonth(month);
            setYear(year);
            display(true);
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void display(boolean validation) {
        if (validation) {
            System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
            isTrue = true;
        } else {
            System.out.println("Please insert valid date");
            isTrue = false;
        }
    }

    public static void main(String[] args) {
        Date date = new Date(11,4,2022);
    }
}

