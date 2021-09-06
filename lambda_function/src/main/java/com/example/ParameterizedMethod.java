package com.example;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        all.add(22);
        all.add(45);
        all.add(78);
        int a = GenMethod.getSecondElement(all);
        System.out.println(a);

        ArrayList<String> all2 = new ArrayList<>();
        all2.add("Hello");
        all2.add("Vla");
        all2.add("Dick");
        String sus = GenMethod.getSecondElement(all2);
        System.out.println(sus);


    }
}
class GenMethod
{
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
