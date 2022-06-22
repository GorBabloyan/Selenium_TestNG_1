package _1_ACA;
public class Reverse_array_3 {
    public static void main(String[] args){
        int [] ele = {1,2,3};
        for(int i=0;i<ele.length- ele.length/2; i++){
            int temp=0;

            temp = ele[i];
            ele[i]= ele[ele.length-1-i];
            ele[ele.length-1-i] = temp;
        }
        for (int a:ele ) {
            System.out.println(a + " ");
        }
    }
}
//public class porc {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7};
//        for ( int i=arr.length- 1; i>=0; i--) //i=3, i>=0//4,3,
//            System.out.println(arr[i]);
//    }
//}