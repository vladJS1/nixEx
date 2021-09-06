package com.nixsolution;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float fahrenheit = in.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }
}
