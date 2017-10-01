import java.util.Scanner;  
class PrintThreeNames
{
	public static void main(String [] arg)
	{
	Scanner sc=new Scanner(System.in);  
	System.out.println("Enter the three names:");
	String name1=sc.next();
	String name2=sc.next();
	String name3=sc.next();
	System.out.println("Hii "+name3+","+name2+" and "+name1);
	sc.close();
	}
}