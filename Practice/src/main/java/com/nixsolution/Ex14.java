package com.nixsolution;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,30,5,70,44,30};

        System.out.println(findCopies(arr));
    }



    public static Set<Integer> findCopies(int[] arr){
        Set<Integer> alCopies = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if(i!=j) {
                    if (arr[i] == arr[j]) {
                        alCopies.add(arr[i]);
                    }
                }
            }

        }
        return alCopies;
    }

}

