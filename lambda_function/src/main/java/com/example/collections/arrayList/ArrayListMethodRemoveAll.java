package com.example.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodRemoveAll {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Java");
        arr.add("I`m");
        arr.add("Happy");
        System.out.println(arr);

        List<String> list1 =arr.subList(1,3);
        System.out.println(list1);

        ArrayList<String> removable = new ArrayList<>();
        removable.add("Hello");
        removable.add("Java");
        removable.add("Ruby");

//        arr.removeAll(removable);
//        System.out.println(arr);

//        arr.retainAll(removable);
//        System.out.println(arr);

//        boolean result = arr.containsAll(removable);
//        System.out.println(result);

//        Unmodifiable lists
        List<Integer> listInt = List.of(3,8,13);
        System.out.println(listInt);
//        listInt.add(100);

        List<String> list2 = List.copyOf(arr);
        System.out.println(list2);

    }

}
