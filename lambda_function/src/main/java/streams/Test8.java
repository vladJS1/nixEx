package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

        Map<Integer,List<Student>> map = al.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .collect(Collectors.groupingBy(el->el.getCourse()));

        for(Map.Entry<Integer,List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }

}
