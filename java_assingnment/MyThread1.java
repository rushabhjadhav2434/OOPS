public class MyThread1 implements Runnable
{
public void run()
{
System.out.println("Thread as created");
}
public static void main(String args[])
{
MyThread1 s=new MyThread1();
Thread t=new Thread(s);
t.start();
}
}
