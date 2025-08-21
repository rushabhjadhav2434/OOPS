class Overriding
{
public void meth()
{
System.out.print("IN parent class");
}
}
class child1 extends Overriding
{
public void meth()
{
System.out.print("In child class");
}
public static void main(String[] args)
{
child1 s=new child1();
s.meth();
}
}