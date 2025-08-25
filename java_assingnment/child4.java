class Super_var
{
int a=39;
}
public class child4 extends Super_var
{
public void dis(int a)
{
System.out.println("var of parent class:"+super.a);
System.out.println("var of child class:"+a);
}
public static void main(String [] args)
{
child4 s=new child4();
s.dis(29);
}
}
