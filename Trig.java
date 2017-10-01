import java.lang.*;
import java.util.Scanner;
class Trig 
{
   public static void main(String[] arg) 
   {
	double a;
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter the angle in degree:");
	a = sc.nextDouble();
	a = Math.toRadians(a);
	System.out.println("Math.sin("+a+")="+Math.sin(a));
	System.out.println("Math.cos("+a+")="+Math.cos(a));
   }
}
	   