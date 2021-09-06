package com.company;



public class B {
    public static void main(String[] args) {
        B b = new B();
        b.test("Hello world");
    }
    public I create() {
        return (e) -> { System.out.println(e); };
    }

    private I i = this::create;

    public void test(String line) {
        i.print(line);
    }
}
