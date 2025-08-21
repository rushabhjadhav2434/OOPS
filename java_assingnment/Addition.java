public class Addition{
public void add()
{
int a=8,b=9;
int t=a+b;
System.out.println("addition is:"+t);
}
public int add(int x,int y)
{
int w=x+y;
return w;
}
public float add(float p,float q)
{
float m=p+q;
return m;
}
public double add(double m,double n)
{
double s=m+n;
return s;
}
public static void main(String args[])
{
Addition o=new Addition();
o.add();
System.out.println("Addition of two int:"+o.add(2,4));
System.out.println("Addition of two float :"+o.add(2.7f,4.9f));
System.out.println("Addition of two double:"+o.add(2.2d,4.5d));

}
}
