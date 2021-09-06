package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(455,"IVan Ivanov");
        map1.put(222,"Maria Sidorova");
        map1.put(546,"Vanya Sobolovsky");
        map1.put(895,"Danil Ikol");
        map1.put(632,"Yuriy Mirovov");
        map1.put(null,"Jack vaek");
        map1.putIfAbsent(1000,"Oleg Ivanov");
        System.out.println(map1);
//        System.out.println(map1.remove(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }

}
