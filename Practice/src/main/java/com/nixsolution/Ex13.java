package com.nixsolution;

import java.util.Arrays;

public class Ex13 {


    public static void main(String[] args) {
        int[] arr = {1,2,7,30,5,70,44};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(reverseArray(arr)));

    }

    public static int[] reverseArray(int[] arr){
        int[] arr_prototype = new int[arr.length];

        int j=0;
        for (int i = arr.length-1; i >=0 ; i--,j++) {
            arr_prototype[j] = arr[i];
        }
        return arr_prototype;
    }
}

