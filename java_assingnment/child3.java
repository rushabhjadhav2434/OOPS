class Super_con
{
public Super_con()
{
System.out.println("In parent class");
}
}
public class child3 extends Super_con
{
public child3(String p)
{
super();
System.out.println("In child class:" +p);
}
public static void main(String [] args)
{
child3 s=new child3("rushabh");
}
}
