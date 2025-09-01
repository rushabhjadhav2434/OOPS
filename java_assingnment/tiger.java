abstract class animal
{
public abstract void voice();
public void eat()
{
System.out.println("Eating....");
}
}
public class tiger extends animal
{
public void voice()
{
System.out.println("awooo...");
}
public static void main(String args[])
{
animal o=new tiger();
o.eat();
o.voice();
}
}