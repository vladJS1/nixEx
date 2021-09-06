package com.nixsolution;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        int[] arr = {1,2,7,30,5,70,44};
        System.out.println(Arrays.toString(arr));

        System.out.println(getAvgValue(arr));

    }
    public static double getAvgValue(int[] arr){
        double sum = 0;
        double avgValue;

        if(arr.length==0) return 0;

        if(arr.length==1) return arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        avgValue = sum/arr.length;

        return avgValue;
    }
}
