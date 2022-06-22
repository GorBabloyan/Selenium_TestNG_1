package _3_ItProger_Java;

import java.util.ArrayList;

public class ex_3 {
    public static void main(String[] args){

        add(20);

    }

    static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for (int a: list){
            if (min>list.get(a)){
                min=list.get(a);
            }
        }
        return min;
    }



    static void add(int value){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<value; i++){
            arr.add(i);
        }
        display(arr);
        System.out.println("Min is " + min(arr));
    }

    static void display(ArrayList list){
        for(Object ele :  list){
            System.out.println(ele);
        }
    }

}









//    ArrayList<Integer> nums = new ArrayList<Integer>();
//        for (int i=0; i<10; i++){
//        nums.add(i*2);
//        }
//        System.out.println(nums);
//        int min = nums.get(0);
//        for(int i = 0; i<nums.size(); i++){
//        if (min>nums.get(i)){
//        min=nums.get(i);
//        }
//        }
//        System.out.println("Min =: " + min);