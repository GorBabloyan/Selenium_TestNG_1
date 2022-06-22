package _2_ACA_Homvork;

public class Homework_3 {

    public static void main(String[]args) {
        String sortBy = "descending";
        int[] myarray = {1,2,3};
        int temp = 0;
        if (sortBy.equals("descending") || sortBy.equals("ascending")) {
            for (int j = 0; j < myarray.length; j++) {
                for (int k = 1; k < myarray.length - j; k++) {
                    if (myarray[k - 1] > myarray[k] && sortBy.equals("ascending")) {
                        temp = myarray[k];
                        myarray[k] = myarray[k - 1];
                        myarray[k - 1] = temp;
                     }
                    if (myarray[k - 1] < myarray[k] && sortBy.equals("descending")) {
                        temp = myarray[k];
                        myarray[k] = myarray[k - 1];
                        myarray[k - 1] = temp;
                    }
                }
            }
            for (int i : myarray) {
                System.out.println(i);
            }
        }
        else{
            System.out.println("You type a wrong sorting method. Please type descending or ascending");
        }
    }
}

