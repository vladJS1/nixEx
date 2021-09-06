package com.example.collections.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class binarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(-19);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        int index = Collections.binarySearch(arrayList,12);
        System.out.println(index);

        ArrayList<Employee> ls = new ArrayList<>();
        Employee emp1 = new Employee(12,"Ivan",5666);
        Employee emp2 = new Employee(1,"Mariya",4654);
        Employee emp3 = new Employee(14,"Sergey",8999);
        Employee emp4 = new Employee(12,"Olya",8888);
        ls.add(emp1);
        ls.add(emp2);
        ls.add(emp3);
        ls.add(emp4);
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
        int index2 = Collections.binarySearch(ls,new Employee(14,"Sergey",8999));
        System.out.println(index2);
    }
}

class Employee implements Comparable<Employee>{

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee anotherEmp) {
        int result = this.id-anotherEmp.id;
        if(result==0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}