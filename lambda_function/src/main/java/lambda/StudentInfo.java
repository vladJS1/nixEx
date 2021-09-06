package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    void testStudents(ArrayList<Student> al,Predicate<Student> pr){
        for(Student s : al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
//
//    void printStudentsOverGrade(ArrayList<Student> al,int grade){
//        for (Student s: al) {
//            if(s.avgGrade>grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> al, int age){
//        for (Student s: al) {
//            if(s.age<age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> al, int age,double grade,char sex){
//        for (Student s:al) {
//            if(s.age<age && s.avgGrade<grade && s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,2,6.4);
        Student st2 = new Student("NIkolay",'m',28,3,8.3);
        Student st3 = new Student("Elena",'f',19,2,9.1);
        Student st4 = new Student("Petr",'m',35,1,7);
        Student st5 = new Student("Mariya",'f',23,2,3.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
        info.testStudents(students,(Student p) -> {
            return p.avgGrade > 8;
        });
        info.testStudents(students, (Student s) -> {return s.age<30;});
        Predicate<Student> p1 = student -> student.avgGrade>7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudents(students, p1.negate());

        info.testStudents(students,p1.and(p2));
        System.out.println("----------------------------------");
        Function<Student,Double> f = student -> student.avgGrade;

        double res = avgOfSomething(students,student -> student.avgGrade);



//        info.printStudentsOverGrade(students,8);
//        System.out.println("-----------------------");
//        info.printStudentsMixCondition(students,20,9,'f');

    }
    private static double avgOfSomething(List<Student> list,Function<Student,Double> f){
        double result = 0;
        for (Student st :list ) {
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }
}
//interface StudentChecks{
//    boolean check(Student s);
//}
//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//    }