package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((acc,el)->acc*el).get();
        //5, 8, 2, 4, 3
        //acc = 5  40  80   320 960
        //el =  8   2   4   3   end

        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o  = list100.stream().reduce((acc, el) -> acc*el);
        if(o.isPresent()){
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }

    }
}
