package unit1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"Banana");

        System.out.println(map.get(1));
        System.out.println(map);
    }
}
