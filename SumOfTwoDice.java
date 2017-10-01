
import java.util.Random; 
class SumOfTwoDice
{
    public static void main(String arg[])
    {
       Random rand = new Random(); 
	   int n1 = rand.nextInt(6) + 1; 
	   int n2 = rand.nextInt(6) + 1;
	   System.out.println(" "+(n1+n2));
	 }
}