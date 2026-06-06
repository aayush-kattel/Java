package unit1;

public class ReturnExample {

    static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        int res=add(2,3);
        System.out.println("Result="+res);
    }
}
