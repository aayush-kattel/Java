package unit7;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args){
        try{

            //create registery
            Registry registry= LocateRegistry.getRegistry("127.0.0.1",2020);

            //object lookup
            Calculator calculator=(Calculator)registry.lookup("Calculator");

            System.out.println("Addition: "+calculator.add(1,2));
            System.out.println("Subtraction: "+calculator.add(10,2));
            System.out.println("Mul: "+calculator.add(1,2));
            System.out.println("Div: "+calculator.add(10,2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
