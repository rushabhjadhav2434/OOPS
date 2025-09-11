import java.util.*;
public class Finally
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
try{
int c=a/b;
System.out.println("division is:"+c);
}
catch(Exception e){
System.out.println("you cant divide no. by zero");
}
finally{
System.out.println("your numbers are " +a+ " & " +b);
}
}
}