package com.example;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Privet");
//        Info<Integer> info2 = new Info<>(18);
//        String s = info1.getValue();
////        String fault = info2.getValue();
//        System.out.println(info1);
    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }

}

class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}
class Child extends Parent{
    public void abc(Info<String> info) {
        String i = info.getValue();
    }
}
class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
