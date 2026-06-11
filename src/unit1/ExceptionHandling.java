package unit1;

public class ExceptionHandling {
    public static void main(String[] args){
        try {
            int a=10/0;
            int[] arr={1,2,3};

            System.out.println(a);
            System.out.println(arr[5]);

        }catch (ArithmeticException e){
            System.out.println("Exception: "+e);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
