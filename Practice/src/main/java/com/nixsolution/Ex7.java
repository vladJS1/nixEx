package com.nixsolution;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 1;
        int current  = operand2 + operand1 ;
        int inputNumber;

        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();

        if(inputNumber >= 1) {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(operand1);
            array.add(operand2);
            array.add(current);

            while(true) {
                operand1 = operand2;
                operand2 = current;
                current = operand1 + operand2;

                if(current>inputNumber) break;

                array.add(current);
            }
            System.out.println(array);
        } else  {
            System.out.println(0);
            return;
        }



    }
}
