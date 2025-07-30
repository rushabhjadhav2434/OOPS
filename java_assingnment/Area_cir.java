import java.util.*;
public class Area_cir{
double a,b;
public double area(double p){
a=p;
b=3.14*a*a;
return b;
}
public static void main(String[] args){
System.out.println("Enter the radius of circle");
Scanner s=new Scanner(System.in);
double r;
r=s.nextDouble();
Area_cir s1=new Area_cir();
System.out.println(s1.area(r));
}
}