package unit1;

class Circle{
    void displayCircle(){
        System.out.println("This is circle");
    }
}

class Rectangle extends Circle{
    void displyRectangle(){
        System.out.println("This is rectangle");
    }
}
class Square extends Circle{
    void displaySquare(){
        System.out.println("This is square");
    }
}
public class InheritanceExample {
    public static void main (String[] args){
        Rectangle r1=new Rectangle();
        r1.displayCircle();
        r1.displyRectangle();

        Square r2=new Square();
        r2.displaySquare();
        r2.displayCircle();
    }
}
