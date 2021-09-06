package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length()));
//        }

        //Create stream
        //
        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);

        int[] array = {5,9,7,8,4,3};
        int[] arr1 = Arrays.stream(array).map(element->element%3==0?element=element/3:element).toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(array));
//        for (int a :
//                array) {
//            System.out.println(a);
//        }
//        for (int a :
//                arr1) {
//            System.out.println(a);
//        }
    }
}
