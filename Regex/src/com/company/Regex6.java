package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String myString = "12345678912345670328987" +
                "98765432176543210865856" +
                "52288888999966660444123";
        //
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)\n");
//        System.out.println(myNewString);

        while(matcher.find()){
            System.out.println(matcher.group(7));
        }

    }
}
