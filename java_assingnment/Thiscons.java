public class Thiscons{
int a,b;
public Thiscons(){
this(10,30);
System.out.print("no argument");
}
public Thiscons(int a,int b){
int c=a+b;
System.out.println("addition is :"+c);
}
public static void main(String [] args){
Thiscons s=new Thiscons();

}
}

