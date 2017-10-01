class PowerOf2 
{
 public static void main(String arg[])
 {
 int n=Integer.parseInt(arg[0]);
	if(n>=0 && n<31) //Integer range
	{
		System.out.println("the table is ");
		for(int i=0;i<=n;i++)
		{                
		System.out.println("2^"+i+" = " +Math.pow(2,i));
		}         
	}
 }
}
