package unit1;
class BankAccount{
    int balance=1000;
    synchronized void withdraw(int money){
        if(balance>=money){
            System.out.println(Thread.currentThread().getName()+"withdrawing"+money);
            balance =balance-money;
            System.out.println("Remaining balance"+balance);
        }else{
            System.out.println("Insufficient balance for"+Thread.currentThread().getName());
        }
    }
}
public class ThreadSync {
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount();
        Thread t1=new Thread(() -> bankAccount.withdraw(500));
        Thread t2=new Thread(() -> bankAccount.withdraw(1000));

        t1.start();
        t2.start();
    }
}
