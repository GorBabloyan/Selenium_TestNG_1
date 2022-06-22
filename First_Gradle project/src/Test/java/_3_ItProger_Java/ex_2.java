package _3_ItProger_Java;

import java.util.ArrayList;

public class ex_2 {

    public static void main(String[] args) {

//        int[] arr = new int[3];
//        Scanner scanner = new Scanner(System.in);
//        int b = 0;
//
//        for (int i = 0; i<arr.length; i ++ ){
//            //System.out.println("Type the value");
//           int a = scanner.nextInt();
//           arr[i] = a;
////           b+=arr[i];
////            System.out.println(b);
//        }
//        for (int j:arr){
//            System.out.println(arr[j]);
//        }
//
        int arr[] = {4, 2, 3, 8, 0};
//        for ( int j : arr){
//            System.out.println(j + " ");
//        }
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i<arr.length; i++){
//            if (arr[i]<min){
//                min = arr[i];
//            }
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("min = " + min + "   max = " + max);

//        int arr2[][] = new int[][]
//                {
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                };
//
//        for (int i = 0; i < arr2.length; ++i) {
//            for (int j = 0; j < arr2[i].length; ++j) {
//                System.out.print(arr2[i][j]);
//            }
//            System.out.println();
//        }
        ArrayList num = new ArrayList();
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(1,100);
//        num.remove(1);
//        num.remove(0);
        //num.clear();
        num.set(0,10);
        int k = num.size();
        boolean a =num.isEmpty();
        int b = (int) num.get(0);
        for (Object ele : num){
            System.out.println(ele);
        }
        System.out.println(a + " " + b + " " + k);
    }
}
