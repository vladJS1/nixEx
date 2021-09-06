package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//
//        String s1 = "ABCD ABCD ABCFABCGABCH";
//        String s1 = "ABFOPAB7OP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e|5]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.?");

        //end of string
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abch$");

        //start of string
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abch");


//        String s1 = "abcd!? ab=====ce ++abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+");

        String s1 = "poka abc Vladislav dom kino";
        Pattern pattern1 = Pattern.compile("\\w{4}");




        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println("position: " + matcher.start() + " " + matcher.group());
        }
    }

}
