import java.util.Scanner;
public class PrimeInRange
{        
     static int input1,input2,flag,i,j;         
     public static void main(String args[]) 
	 {
        flag=0;      
        Scanner scan = new Scanner(System.in);      
        System.out.println ("Enter the lower limit :"); 
        input1 = scan.nextInt();
        System.out.println ("Enter the upper limit :"); 
        input2 = scan.nextInt();
        System.out.println ("The prime numbers in between the entered limits are :");
         
        for(i = input1; i <= input2; i++)
        {
            for( j = 2; j < i; j++)
            {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
            }
            if(flag == 1)
            {
                 
                System.out.println(i);
            }
         }
    }
}
