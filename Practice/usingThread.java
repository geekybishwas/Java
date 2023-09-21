class MyThread extends Thread
{
public void run()
{
for(int i=0;i<100;i++)
System.out.println("Running thread from 0 " + i);
}
}
class MyThread1 extends Thread
{
public void run(){
for(int i=0;i<100;i++)
System.out.println("Running thread from 1 " + i);
}
}
public class usingThread{
public static void main(String[] args){
MyThread t1=new MyThread();
MyThread1 t2=new MyThread1();
t2.start();
t1.start();
}
}