import java.util.*;
 
class TemperaturConversion 
{
  public static void main(String[] arg) {
    float temperatue;
    Scanner sc = new Scanner(System.in);      
 
    System.out.println("Enter temperatue in Fahrenheit");
    temperatue = sc.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println("Temperatue in Celsius = " + temperatue);
	System.out.println("Enter temperatue in Fahrenheit");
    temperatue = sc.nextInt();
	temperatue = (temperatue* 9/5) + 32;
	System.out.println("Temperatue in Fahrenheit = " + temperatue);
  }
}