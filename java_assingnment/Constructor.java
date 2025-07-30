public class Constructor{
int id;
String name;
int salary;
public Constructor(){
id=39;
name="Rushabh";
salary=20000;
}
public void display(){
System.out.println("Employee IMfo");
System.out.println("Employee ID:"+id);
System.out.println("Employee name:"+name);
System.out.println("Employee salary:"+salary);
}
public static void main(String[] args){
Constructor s=new Constructor();
/*System.out.println("Employee IMfo");
System.out.println("Employee ID:"+s.id);
System.out.println("Employee name:"+s.name);
System.out.println("Employee salary:"+s.salary);*/
s.display();
}
}
