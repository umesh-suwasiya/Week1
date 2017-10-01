import java.util.Scanner;  
class DoubleOpt
{  
 public static void main(String args[])
 {  
   Scanner sc=new Scanner(System.in);  
   System.out.println("Enter the value of a");  
   double a=sc.nextDouble();
   System.out.println("Enter the value of b"); 
   double b=sc.nextDouble();
   System.out.println("Enter the value of c"); 
   double c=sc.nextDouble();
   System.out.println("a+b*c="+(a+b*c)); 
   System.out.println("a*b+c="+(a*b+c));
   System.out.println("c+a/b="+(c+a/b));
   System.out.println("a%b +c="+(a%b+c));
   sc.close();  
 }  
}  
   