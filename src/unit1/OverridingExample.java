package unit1;
class Animal{
    void makesound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("dog makes sound");
    }
}

public class OverridingExample {
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.makesound();
    }
}
