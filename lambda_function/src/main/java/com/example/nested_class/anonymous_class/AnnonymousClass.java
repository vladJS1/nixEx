package com.example.nested_class.anonymous_class;

public class AnnonymousClass {
    public static void main(String[] args) {
        Math m = new Math(){
            int c = 10;
            @Override
            public int doOperation(int a,int b){
                return a + b;
            }
        };
        Math m2 = new Math(){
            @Override
            public int doOperation(int a,int b){
                return a*b;
            }
        };
        Math m3 = new Math(){
            public int doOperation(int a,int b){
                return a%b;
            }
        };
        System.out.println(m.doOperation(2,3));
        System.out.println(m2.doOperation(2,3));

    }
}

interface Math{
    int doOperation(int a, int b);
}
