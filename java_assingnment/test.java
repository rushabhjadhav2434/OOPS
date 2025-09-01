abstract class Bank_account
{
public abstract void deposit();
public abstract void withdraw();
public abstract void balance();
public void getdetails()
{
System.out.println("name,email,account number...");
}
}
class saving extends Bank_account
{
public void deposit()
{
System.out.println("50000 deposited ");
}
public void withdraw()
{
System.out.println("1000 withdrawals");
}
public void balance()
{
System.out.println("balance is 4000");
}
}
class current extends Bank_account
{
public void deposit()
{
System.out.println("1000 deposited ");
}
public void withdraw()
{
System.out.println("100 withdrawals");
}
public void balance()
{
System.out.println("balance is 900");
}
}
public class test
{
public static void main(String args[])
{
Bank_account s= new saving();
s.deposit();
s.withdraw();
s.balance();
s.getdetails();
Bank_account c=new current();
c.deposit();
c.withdraw();
c.balance();
c.getdetails();
}
}

 


