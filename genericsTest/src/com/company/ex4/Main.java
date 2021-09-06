package com.company.ex4;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(new Account<String>("name",23),4000);
        Account acc2 = new Account(57757, 500);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
