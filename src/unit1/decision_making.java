package unit1;

public class decision_making {
    public static void main(String[] args){
        //if-else statement
        int percentage=70;
        if(percentage>=90){
            System.out.println("Grade:A+");
        }else if(percentage>=80){
            System.out.println("Grade:A");
        } else if (percentage>=60){
            System.out.println("Grade:B");
        }else {
            System.out.println("Grade:NG");
        }

        //nested if
        int age=20;
        String nationality="Indian";
        if(age>=18){
            if(nationality.equals("Nepali")){
                System.out.println("Can vote..");
            }else{
                System.out.println("Nationality must be Nepali");
            }
        }else{
            System.out.println("Must be aged 18+");
        }

        //switch-case
        int day=6;
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            default:
                System.out.println("Holiday");
                break;
        }
    }
}
