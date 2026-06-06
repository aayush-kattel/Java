package unit1;

public class looping {
    public static void main(String[] args){
        //for-loop
        int i;
        for (i=1;i<=5;i++){
            System.out.println("for loop "+i);
        }

        //while loop
        i=1;
        while(i<=5){
            System.out.println("While loop "+i);
            i++;
        }

        //Do-while loop
        i=1;
        do{
            System.out.println("do while loop "+i);
            i++;
        }while(i<=5);
    }
}
