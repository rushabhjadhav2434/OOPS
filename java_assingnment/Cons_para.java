public class Cons_para{
int id;
String name;
int salary;

public Cons_para(int a,String n,int s){
id=a;
name=n;
salary=s;
}

public Cons_para(Cons_para obj){
id=obj.id;
name=obj.name;
salary=obj.salary;
}

public void display(){
System.out.println("Employee IMfo");
System.out.println("Employee ID:"+id);
System.out.println("Employee name:"+name);
System.out.println("Employee salary:"+salary);
}

public static void main(String[] args){
Cons_para s1=new Cons_para(39,"rushabh",200000);
Cons_para s2=new Cons_para(s1);
s1.display();
s2.display();
}
}


