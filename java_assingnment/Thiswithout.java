public class Thiswithout{
int roll;
String name;
int marks;
public Thiswithout(int roll,String name,int marks){
roll=roll;
name=name;
marks=marks;
}
public void display(){
System.out.print("Name:"+name+"roll:"+roll+"marks:"+marks);
}
public static void main(String[] args){
Thiswithout s=new Thiswithout(39,"rushabh",99);
s.display();
}
}