package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        Student st1 =  new Student("Ivan",'m',22,3,8.3);
        Student st2 =  new Student("Nikolay",'m',28,2,6.3);
        Student st3 =  new Student("Elena",'f',19,1,8.9);
        Student st4 =  new Student("Petr",'m',35,4,7);
        Student st5 =  new Student("Mariya",'f',23,3,7.4);
        List<Student> al = new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        al.add(st4);
        al.add(st5);

        Student stMin =  al.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        Student stMax =  al.stream().max((x,y) -> x.getAge() - y.getAge()).get();

        System.out.println(stMin);
        System.out.println(stMax);
//
//        al.stream().filter(e->e.getAge()>20).limit(2).forEach(System.out::println);
//        System.out.println("-----------------------------------------------");
//        al.stream().filter(e->e.getAge()>20).limit(2).forEach(System.out::println);
//        System.out.println("-----------------------------------------------");
//        al.stream().filter(e->e.getAge()>20).skip(2).forEach(System.out::println);

        List<Integer> courses = al.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        int sum = al.stream()
                .mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        double average = al.stream()
                .mapToInt(el -> el.getCourse())
                .average().getAsDouble();
        System.out.println(average);
    }

}
