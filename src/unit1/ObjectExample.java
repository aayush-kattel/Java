package unit1;

class Demo{
    void displayData(int a,int b){
        System.out.println("This is Demo Data. "+a+" Hello "+b);
    }
}

public class ObjectExample {
    public static void main(String[] args){
        //named object
        Demo d=new Demo();
        d.displayData(3,4);

        //an
        new Demo().displayData(2,3);
    }
}
