package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Regex5 {
    public static void main(String[] args) {
        String s1 = "Privet   moy drug! kak idet izucheniye   Java";
        System.out.println(s1);
//        s1 = s1.replace("Java","SQL");
        s1 = s1.replaceAll(" {2,}"," ");
        s1 =  s1.replaceAll("\\bi\\w+","4444");
        System.out.println(s1);
    }
}
