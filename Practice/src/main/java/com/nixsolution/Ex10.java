package com.nixsolution;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[] arr = {24,13,-1,2,4,70,44};

        System.out.println(Arrays.toString(arr));

        bobbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void bobbleSort(int[] arr){
        boolean needIteration = true;
        while(needIteration){
            needIteration = false;
            for (int i = 1;i<arr.length;i++){
                if(arr[i] < arr[i-1]){
                    if(arr[i]==arr[i-1]) continue;
                    arr[i] = arr[i] ^ arr[i-1];
                    arr[i-1] = arr[i]^arr[i-1];
                    arr[i] = arr[i]^arr[i-1];
                    needIteration = true;
                }
            }
        }
    }
}
