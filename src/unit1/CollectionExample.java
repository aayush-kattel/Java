package unit1;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args){
        List<Integer> list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);
        System.out.println(list.get(2));
    }
}
