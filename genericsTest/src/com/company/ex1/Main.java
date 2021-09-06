package com.company.ex1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client<Integer> accInt = new Account<Integer>(1, 400);
        Client<String> accString = new Account<String>("firstObject", 500);

        System.out.println(accInt);
        System.out.println(accString);

        System.out.println(accString.getId());
    }
}
