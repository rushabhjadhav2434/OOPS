public class MyThread extends Thread
{
public void run()
{
System.out.println("Thread as created");
}
public static void main(String args[])
{
MyThread s=new MyThread();
s.start();
}
}
