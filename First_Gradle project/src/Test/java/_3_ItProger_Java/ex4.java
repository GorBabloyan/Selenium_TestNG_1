package _3_ItProger_Java;

public class ex4 {
     byte sum(byte[] a) {
        byte sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        byte[] arr1 = new byte[]{1, 2, 3};
        ex4 e = new ex4();
        int sum1 = e.sum(arr1);
        System.out.println("sum is : " + sum1);

        byte[] arr2 = new byte[]{7, 8, 10, 1, 2, 3};
        int sum2 = e.sum(arr2);
        System.out.println("sum is : " + sum2);

    }
}
