package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String s =
                    "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                    "email: ivanov@mail.ru, Postcode: AA99, Phone Number: +1233456789;" +
                    "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18," +
                    "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                    "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                    "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";
//	Pattern pattern = Pattern.compile("\\w+");

        //search
        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b");


        Pattern pattern2 = Pattern.compile("\\w+@\\w+\\.\\w{1,3}");

        String s1 = "abcd abce3 ababab78bcg6abch";
        Pattern pattern4 = Pattern.compile("[12](\\d{1,2})?\\.\\d{0,3}\\.\\d{1,3}\\.\\d{1,3}");

        Matcher matcher  = pattern4.matcher(s1);
        while(matcher.find()){
            System.out.println("position: "+ matcher.start() + " " + matcher.group());
        }

    }
}
