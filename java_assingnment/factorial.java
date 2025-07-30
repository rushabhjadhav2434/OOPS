import java.util.*;
public class factorial{
public int fact(int n){
int total=1;
if(n>=1){
total=n*fact(n-1);
}
return total;

}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num;
num=s.nextInt();
factorial f=new factorial();
int ans=f.fact(num);
System.out.println("factorial is:"+ans);

}
}