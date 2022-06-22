package _1_ACA;

public class largest_element_2 {
    public static void main(String[] args){
        int [] elements = { -10,0,-2,7};
        int temp=0;
        for(int i = 0; i< elements.length; i++){

            for(int j = 1; j< elements.length-i; j++ ){

                if(elements[j-1]<elements[j]){

                    temp=elements[j];
                    elements[j] = elements[j-1];
                    elements[j-1] = temp;

                }
            }

        }
        System.out.println("Second largest element is - " + elements[1]);
       // System.out.println("Smallest element is - " + elements[elements.length-1]);


        for(int a : elements) {
            System.out.println(a);
        }
    }
}
