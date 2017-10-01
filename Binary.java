class Binary
{
public static void main(String arg[])
{
	int n=Integer.parseInt(arg[0]);
	int a[]=new int[32];
	int i;
	for(i=0;i<32;i++)
	{
	a[i]=0;
	}
	for(i=31;i>=0;i--)
	{
		if(n%2==0)
		{
		a[i]=0;
		n=n/2;
		}	
		else
		{
		a[i]=1;
		n=n/2;
		}	
	}
	for(i=0;i<32;i++)
	{	
	System.out.print(a[i]);
	if(i==7 || i==15 || i== 23)
				System.out.print(" ");
	}
}
}
