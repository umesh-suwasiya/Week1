import java.util.Scanner;  
class IntOpt
{  
 public static void main(String args[])
 {  
   Scanner sc=new Scanner(System.in);  
   System.out.println("Enter the value of a");  
   int a=sc.nextInt();
   System.out.println("Enter the value of b"); 
   int b=sc.nextInt();
   System.out.println("Enter the value of c"); 
   int c=sc.nextInt();
   System.out.println("a+b*c="+(a+b*c)); 
   System.out.println("a*b+c="+(a*b+c));
   System.out.println("c+a/b="+(c+a/b));
   System.out.println("a%b +c="+(a%b+ c));
   sc.close();  
 }  
}  
   