class Multi1 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("the current thread is "+ Thread.currentThread().getName());
}
public static void main(String args[])
{
Multi1 m=new Multi1();
Thread t1=new Thread(m,"Rushabh");
Thread t2=new Thread(m,"Yogesh");
t1.start();
t2.start();
}
}


