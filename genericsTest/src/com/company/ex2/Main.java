package com.company.ex2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Tom", "Alice","Sam","Kate","Bob","Helen"};
        Integer[] numbers = {23,4,5,2,13,25,4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}
