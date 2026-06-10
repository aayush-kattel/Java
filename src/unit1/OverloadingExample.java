package unit1;
class addition{
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class OverloadingExample {
    public static void main(String[] args){
        addition data=new addition();
        System.out.println("First Result: "+data.add(1,5));
        System.out.println("Second Result: "+data.add(22.5,5.5));
        System.out.println("Third Result: "+data.add(1,3,4));
    }
}
