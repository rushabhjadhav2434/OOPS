public class Throwtest
{
public static void main(String [] args)
{
int a=10;
int b=0;
if(b==0){
throw new ArithmeticException("you cant divide by zero");
}
else{
System.out.println(a+b);
}
}
}