package com.company.ex3;

public class Main {
    public static void main(String[] args) {
        Account<String, Double> acc1 = new Account<>("first", 233.0);
        Account<Integer, Float> acc2 = new Account<>(1, 233.3f);

        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s Sum: %f \n",id,sum);
        System.out.printf("Id: %d Sum: %f \n",acc2.getId(),acc2.getSum());

    }
}
