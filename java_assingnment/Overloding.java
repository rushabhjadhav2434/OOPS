class Overloding
{
public void area(){
int l=10;
int b=30;
int a=l*b;
System.out.println("Area of rectangle:"+a);
}
public double area(int r){
double a=3.14*r*r;
return a;
}
public double area(int h,int b){
double a=0.5*h*b;
return a;
}
public static void main(String args[])
{
Overloding s=new Overloding();
s.area();
System.out.println("Area of circle:"+s.area(5));
System.out.println("Area of triangle:"+s.area(7,8));
}
}