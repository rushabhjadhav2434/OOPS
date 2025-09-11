class TestArray
{
public static void main(String args[])
{
int[] arr={2,3,4,5,6};
try{
System.out.println(arr[5]);
}
catch(Exception e)
{
System.out.println("your array is of size 5 and you are accessing 6 element");
}
System.out.println(arr[2]);
}
}