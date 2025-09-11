class Null_pointer
{
public static void main(String args[])
{
String n="rushabh";
System.out.println(n.length());
try{
String m=null;
int b=m.length();
}
catch(Exception e)
{
System.out.println("the string is null we cant find its length");
}
}
}