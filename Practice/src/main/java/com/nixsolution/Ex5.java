package com.nixsolution;


import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String num = in.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(num);
        int sum = 0;
        for (int i = 0; i < builder.length(); i++) {
            sum += Integer.parseInt(String.valueOf(builder.charAt(i)));
        }
        System.out.println(sum);
    }
}
