package com.company;

public class PrintfEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Zaur","Tregulov",12345,0.13);
        Employee emp2 = new Employee(2,"Ivan","Ivanov",4565,0.13);
        Employee emp3 = new Employee(3,"Igor","Djigan",8989,0.13);
        Employee emp4 = new Employee(4,"Tolik","Gerasimov",5666,0.13);
        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);
        employeeInfo(emp4);

        String newString = String.format("%03d \t %-12s" +
                        "\t %-12s \t %,.1f \n"
                ,emp1.id,emp1.name,emp1.surname
                ,emp1.salary*(1+emp1.bonusPct));
        System.out.println(newString);
    }
    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s" +
                        "\t %-12s \t %,.1f \n"
                ,emp.id,emp.name,emp.surname
                ,emp.salary*(1+emp.bonusPct));
    }
}


class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }


}
