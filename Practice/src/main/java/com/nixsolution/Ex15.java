package com.nixsolution;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int[] arr = {1,2,7,30,5,70,44};
        int[] arr1 = {1,4,17,30,28,99};
        showInterception(arr,arr1);

    }

    public static void showInterception(int[] arr1, int[] arr2){
        ArrayList<Integer> alInterception = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    alInterception.add(arr1[i]);
                }
            }
        }
        System.out.println(alInterception);
    }
}
