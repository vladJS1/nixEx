package lambda.predicate;

import lambda.Student;
import lambda.StudentInfo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Removeif {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("OK");
        al.add("Uchim Java");
        al.add("A imenno lambda");
//        al.removeIf(element -> element.length()<5);
        Predicate<String> p = element -> element.length()<5;
        al.removeIf(p);
        Predicate<Student> p1 = student -> student.avgGrade>7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        System.out.println(al);
    }
}
