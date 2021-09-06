package com.nixsolution;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int k = 1;
        Scanner in = new Scanner(System.in);
        int countOfIteration;

        System.out.println("Floyd triangle!!!");
        System.out.print("Input number of iteration: ");
        countOfIteration = in.nextInt();
        System.out.println();

        for (int i = 1; i <= countOfIteration; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
                k++;
            }

            System.out.println();
        }
    }
}
