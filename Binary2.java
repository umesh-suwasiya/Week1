class Binary2
{
public static void main(String []arg)
{
	int n=Integer.parseInt(arg[0]);
	int a[]=new int[8];
	int r[]=new int[8];
	int i,j;
	double no=0;
	for(i=0;i<8;i++)
	{
	a[i]=0;
	}
	for(i=7;i>=0;i--)
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
	System.out.print("Binary form of"+n+"is =");
	for(i=0;i<8;i++)
	{	
	System.out.print(a[i]);
	}
	System.out.println();
		
	System.out.println("Swapped Binary is:");
	
			
		for(i=4,j=0;i<8 || j<4;i++,j++)
		{
		r[j]=a[i];
		System.out.print(r[j]);
		}
		for(i=0,j=4;i<4 || j<8;i++,j++)
		{	
			r[j]=a[i];		
			System.out.print(r[j]);
		}
	for(j=7;j>=0;j--)
	{
	if(r[j]==1)
	{
		no=no+Math.pow(2,7-j);
		System.out.println(no);
	}
	}
	System.out.println("Swapped Binary's Decimal form is: "+no);
	
	}
}
