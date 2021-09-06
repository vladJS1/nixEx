package com.example.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
        List<?> list1 = new ArrayList<Object>();

        //bounded wildcard
        List<? extends Number> list30 = new ArrayList<Integer>();


        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.11);
        list2.add(3.19);
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.11);
        ald.add(3.19);
        System.out.println(summ(ald));

        ArrayList<Integer> intarr = new ArrayList<>();
        intarr.add(30);
        intarr.add(45);
        intarr.add(8);
        System.out.println(summ(intarr));

        ArrayList<String> als = new ArrayList<>();
        als.add("Hello");
        als.add("World");
        als.add("Java");
//        System.out.println(summ(als));
    }
    static void showListInfo(List<?> list){
        System.out.println("List consist of the following items: " + list);
    }


    public static double summ(ArrayList<? extends Number> al){
        double summ=0;
        for (Number n: al) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
