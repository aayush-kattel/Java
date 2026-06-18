package unit1;

class Mythread extends Thread{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Thread Counter: "+i);
        }
    }
}

class MyThread2 extends  Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("thread two counter"+i);
        }
    }
}

class ThreadExample{
    public static void main(String[] args){
        Mythread mythread=new Mythread();
        MyThread2 mythread2=new MyThread2();
        mythread.start();
        mythread2.start();
    }
}
