package _1_ACA;

public class String_Array {
    public static void main(String[]args){

        String [] arr = {"bad", "add", "jude", "bad", "oic", "oic", "poiu","bad"};
        for (int i = 0; i< arr.length -1; i++){
            String a = arr[i];

            for (int j=i+1; j<arr.length; j++ ){

              if (a.equals(arr[j]))
              {
                System.out.println( a + " Has duplicate ");
                break;
            }
            }


        }

    }
}
