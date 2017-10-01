import java.util.Scanner;
class Quadratic
{
    public static void main(String args[])
    {
       int a,b,c,delta;
	   double x1,x2;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Values of a, b & c: ");
	   a= sc.nextInt();
	   b=sc.nextInt();
	   c=sc.nextInt();
	   delta = b*b - 4*a*c;
	   x1 = (-b + Math.sqrt(delta))/(2*a);
	   x2 = (-b - Math.sqrt(delta))/(2*a);
	   System.out.print("Two roots of equation are:"+x1+ "&" +x2);
	}
}