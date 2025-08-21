class parent{
int salary=100000;
public void display()
{
System.out.println("In parent class");
}
}
public class Child extends parent{
int bonus =20000;
public void sum(){
System.out.println("In child class");
}
public static void main(String [] args){
Child c=new Child();
int total=c.salary+c.bonus;
System.out.println("Total salary is:"+total);
c.display();
c.sum();
}
}