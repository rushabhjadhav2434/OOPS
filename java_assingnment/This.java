public class This{
int roll;
String name;
int marks;
public This(int roll,String name,int marks){
this.roll=roll;
this.name=name;
this.marks=marks;
}
public void display(){
System.out.print("Name:"+name+"roll:"+roll+"marks:"+marks);
}
public static void main(String[] args){
This s=new This(39,"rushabh",99);
s.display();
}
}