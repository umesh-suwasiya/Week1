import java.util.Random;
import java.util.Scanner;
class RollDie
{
	public static void main(String []arg)
	{
	int n,max=0,j,i=0;
	int a[]={0,0,0,0,0,0};
	Scanner sc=new Scanner(System.in);
	System.out.println ("Enter the value of n:"); 
        n = sc.nextInt();
	while(i<n)
	{
		Random rand = new Random();
		int roll= rand.nextInt(6) + 1;
		i++;
		System.out.println(roll);
		switch(roll)
		{
		case 1:
		a[0]++;
		break;
		
		case 2:
		a[1]++;
		break;
		case 3:
		a[2]++;
		break;
		case 4:
		a[3]++;
		break;
		case 5:
		a[4]++;
		break;
		case 6:
		a[5]++;
		break;
		default:
		break;
		}

	}
	
	max=a[0];

	for(j=0;j<a.length;j++)
	{

	System.out.println("a["+(j+1)+"]="+a[j]);
	if(max<a[j])
		{
		max=a[j];
		}	
	}
	
	System.out.println(+max+" is Reapeating Maximum no of times");
	}
}
