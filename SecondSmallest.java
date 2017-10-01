class SecondSmallest
{
	public static void main(String []arg)
	{
	int i;
	int a[]={10,50,80,96,12,37,25,98,100,45};
	int smallest=a[0];
	int secondsmallest=a[1];
	for(i=0;i<a.length;i++)
	{
		if(a[i]<smallest)
		{
		//secondsmallest=smallest;
		smallest=a[i];
		}
		else if(a[i]>smallest && a[i]<secondsmallest)
		{
		secondsmallest=a[i];
		}
	}
	System.out.println("Smallest no="+smallest+"SecondSmallest="+secondsmallest);
	}
}
