abstract class player
{
public abstract void fitness();
}
public class batsman extends player
{
public void fitness()
{
System.out.print("fitness of batsman");
}
public static void main(String [] args)
{
batsman o=new batsman();
o.fitness();
}
}


