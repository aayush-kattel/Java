package unit1;

public class UserDefinedException {
    
    static void ValidateAge(int age) throws  InvalidAgeException{
        if(age<18){
            throw  new InvalidAgeException("invalid age");
        }else{
            System.out.println("Can vote !!");
        }
    }
    
    public static void main (String[] args){
        try{
            ValidateAge(9);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
