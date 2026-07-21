package unit7;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args){
        try{
            //create object
           CalculatorImpl calculator=new CalculatorImpl();

           //create Registry-providing name to object
            Registry registry= LocateRegistry.createRegistry(2020);
            registry.rebind("Calculator",calculator);

            System.out.println("Server Started...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
