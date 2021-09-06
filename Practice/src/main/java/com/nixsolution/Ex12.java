package com.nixsolution;

public class Ex12 {
    public static void main(String[] args) {
        int[] arr = {24,13,-1,2,4,70,44};
        getMinMax(arr);
    }

    public static void getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }



        System.out.printf("min = %s, max = %s",min,max);
    }
}
