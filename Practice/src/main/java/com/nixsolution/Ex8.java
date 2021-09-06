package com.nixsolution;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = (int) (1 + Math.random() * 7);
            switch (a) {
                case 1:
                    System.out.println("1 - Понедельник");
                    break;
                case 2:
                    System.out.println("2 - Вторник");
                    break;
                case 3:
                    System.out.println("3 - Среда");
                    break;
                case 4:
                    System.out.println("4 - Четверг");
                    break;
                case 5:
                    System.out.println("5 - Пятница");
                    break;
                case 6:
                    System.out.println("6 - Суббота");
                    break;
                case 7:
                    System.out.println("7 - Воскресенье");
                    break;
            }
            System.out.print("Print '0' to exit: ");
            try {
                int exit = Integer.parseInt(in.nextLine());
                if (exit == 0) {
                    break;
                }
            }catch(Exception e){
                continue;
            }
        }
    }


}
