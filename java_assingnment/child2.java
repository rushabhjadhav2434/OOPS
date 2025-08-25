class Super
{
public void dis()
{
System.out.println("In parent class");
}
}
public class child2 extends Super
{
public void dis()
{
super.dis();
System.out.println("In child class");
}
public static void main(String [] args)
{
child2 s=new child2();
s.dis();
}
}
