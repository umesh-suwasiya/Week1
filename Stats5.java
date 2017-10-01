import java.lang.*;
class Stats5
{
    public static void main(String arg[])
    {
	int i;
	double n,avg,max=0,min=1,sum=0;
	for(i=0;i<5;i++)
	{
		n= Math.random();
		max=Math.max(n,max);
		min=Math.min(n,min);
		sum=sum+n;
		System.out.println(""+n);
		
	}
	avg=sum/5;
	System.out.println("Average="+avg);
	System.out.println("Max no="+max);
	System.out.println("Min no="+min);
	}
}
	