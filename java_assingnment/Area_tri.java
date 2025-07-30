import java.util.*;
public class Area_tri{
double p,q,r;
public double area(double a,double b){
p=a;
q=b;
r=0.5*a*b;
return r;
} 
public static void main(String[] args){
System.out.println("Enter the height and base");
Scanner s=new Scanner(System.in);
double b,h;
h=s.nextDouble();
b=s.nextDouble();
Area_tri s1=new Area_tri();
System.out.println(s1.area(h,b));
}
}