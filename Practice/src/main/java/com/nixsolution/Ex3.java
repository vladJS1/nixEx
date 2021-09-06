package com.nixsolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
    public static void calculate(String args1,String args2,String operation) {
        try  {
            int firstNum = Integer.parseInt(args1);
            int secondNum = Integer.parseInt(args2);
            switch (operation) {
                case "sum":
                    System.out.println("Sum: " + (firstNum + secondNum));
                    break;
                case "sub":
                    System.out.println("Sub: " + (firstNum - secondNum));
                    break;
                case "mult":
                    System.out.println("Mult: " + (firstNum * secondNum));
                    break;
                case "div":
                    if (secondNum == 0) {
                        throw new ArithmeticException("Illegal operation divide by zero");
                    }
                    System.out.println("Div: " + (firstNum / secondNum));
                    break;
                default:
                    System.out.println("Bye");
                    break;

            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Illegal argument format!!!");
        }

    }

    public static void main(String[] args) {
        if (args.length >= 3) {
            calculate(args[0],args[1],args[2]);
        }else{
            System.out.println("Incorrect number of arguments");
        }
    }
}
