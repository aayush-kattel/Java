package unit1;

interface flyable{
    void fly();
}

interface swimable{
    void swim();
}

class Duck implements flyable,swimable{

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}

public class InterfaceExample {
    public static void main(String[] args){
        Duck duck=new Duck();
        duck.fly();
        duck.swim();
    }
}
