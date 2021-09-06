package com.example.game;

public class Test {
    public static void main(String[] args) {
        Schoolboy schoolboy1 = new Schoolboy(12,"Ivan");
        Schoolboy schoolboy2 = new Schoolboy(15,"Mariya");
        Schoolboy schoolboy3 = new Schoolboy(12,"Sergey");
        Schoolboy schoolboy4 = new Schoolboy(14,"Olya");

        Student student1 = new Student(20,"Nikolay");
        Student student2 = new Student(18, "Kseniya");

        Employee employee1 = new Employee(32, "Zaur");
        Employee employee2 = new Employee(47, "Mikhail");


        Team<Schoolboy> schoolarTeam = new Team<>("Drakoni");
        schoolarTeam.addNewParticipant(schoolboy1);
        schoolarTeam.addNewParticipant(schoolboy2);
//        schoolarTeam.addNewParticipant(student1);

        Team<Student> studentTeam = new Team<>("Vpered!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Robotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> books = new Team<String>("Knigi");

        Team<Schoolboy> schoolarTeam2 = new Team<>("Kachki");
        schoolarTeam.addNewParticipant(schoolboy3);
        schoolarTeam.addNewParticipant(schoolboy4);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
