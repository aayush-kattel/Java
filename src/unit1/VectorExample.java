package unit1;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        Vector <Integer> v=new Vector<>();
        v.add(11);
        v.add(22);
        v.add(33);

        //print single data
        System.out.println(v.get(1));
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v.remove(2));

        //print all data from vector
        for(Integer num:v){
            System.out.println(num);
        }
    }
}
