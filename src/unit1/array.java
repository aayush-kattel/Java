package unit1;

import java.util.Arrays;
import java.util.Collections;

public class array {
    public static void main(String[] args){
        Integer[] arr={1,2,4,5,3};
        String[] arr1={"Kattel","Kumar","Swami"};
        double[] arr2={1.1,1.2,1.3,1.4,1.5};

        System.out.println(arr2[2]);
        System.out.println(arr.length);
        //method 1
//        for(int i=0;i<arr.length;i++){
//            System.out.println("element:"+arr[i]);
//        }
        //method 2
//        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int data:arr){
            System.out.println("data:"+data);
        }
    }
}
