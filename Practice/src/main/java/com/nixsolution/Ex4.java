package com.nixsolution;

import java.util.Arrays;

public class Ex4 {
    public static String outputArray(int[] arr){
        int max_index = arr.length-1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if(i==max_index){
                break;
            }
            builder.append(", ");
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,7,15};
        System.out.println(outputArray(array));
        System.out.println(Arrays.toString(array));
    }
}
