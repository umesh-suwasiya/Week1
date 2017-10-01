class SecondLargest
{
	public static void main(String arg[])
	{
	int a[]={10,8,9,3,2,4};
	int i,j,largest,secondlargest;
	largest=a[0];
	secondlargest=a[1];
	for(i=0;i<a.length;i++)
	{
		if(a[i]>=largest)
		{
		//secondlargest=largest;
		largest=a[i];
		}
		else if(a[i]<largest && a[i]>secondlargest)
		{
		secondlargest=a[i];
		}
	}
	
	System.out.println("Largest="+largest+"Second Largest="+secondlargest);
	}
}			
		
