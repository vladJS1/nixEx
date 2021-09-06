package com.company;

import com.company.ex4.Account;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        D<Account> container = new D<>("222", new Account("id", 11));
        System.out.println(container);
        Thread.sleep(5000);
    }
}

class B<T>{
    private T property;
    private String name;
    private Long volume;

    public B(T property,String name,Long volume){
        this.property = property;
        this.name = name;
        this.volume = volume;
    }
}

class C{
    public <T,S> String getFile(T name,S sum){
            return "Hello" + name.toString() + "your sum: " + sum;
    }
}

class D<D>{
    private int size;
    private D container;

    public <T> D(T size,D container){
        this.size = size instanceof String?Integer.parseInt((String) size):0;
        this.container = container;
    }

    @Override
    public String toString() {
        return "D{" +
                "size=" + size +
                ", container=" + container +
                '}';
    }
}