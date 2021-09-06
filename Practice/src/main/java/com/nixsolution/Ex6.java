package com.nixsolution;

public class Ex6 {
    public static void main(String[] args) {
        int result;
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                result = j*i;
                System.out.format("%3d x %2d = %2d\t",j,i,result);
            }
            System.out.println();
        }
    }
}
