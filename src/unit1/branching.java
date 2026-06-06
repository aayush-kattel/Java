package unit1;

public class branching {
    public static void main(String[] args){
        //break
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println("Break Data"+i);
        }

        //continue
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("Continue Data"+i);
        }
    }
}
