public class test_ex1
{
public static void main(String [] args)
{
int a=39,b=0;
int e;
e=a+b;
System.out.println("Addition is:"+e);
try
{
int c;
c=a/b;
System.out.println("division is:"+c);
}
catch(Exception p)
{
System.out.println("we cant divide any number by zero:"+p);
}
int d;
d=a-b;
System.out.println("Subtrsction is:"+d);
}
}