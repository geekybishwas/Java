class MyThreadRunnable implements Runnable{
    public void run()
    {
        for(int i=0;i<50;i++) System.out.println("RUnning from 0 "+ i);
    }
}

class MyThreadRunnable1 implements Runnable{
    public void run()
    {
        for(int i=0;i<50;i++) System.out.println("RUnning from 1 "+ i);
    }
    }
public class usingRunnableInterface{
    public static void main(String[] args){
    MyThreadRunnable t=new MyThreadRunnable();
    MyThreadRunnable1 u=new MyThreadRunnable1();
    Thread t1=new Thread(t);
    Thread u1=new Thread(u);
    t1.start();
    u1.start();
    }
}