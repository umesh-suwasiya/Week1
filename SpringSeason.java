class SpringSeason
{
    public static void main(String []arg)
    {
       int m,d;
	   d = Integer.parseInt(arg[0]);
	   m = Integer.parseInt(arg[1]);
	   if(m==3 && (d>=20 && d<=31))
			System.out.println("TRUE");
	   else if(m==4 && (d>=1 && d<=30))
			System.out.println("TRUE");
		else if(m==5 && (d>=1 && d<=31))
			System.out.println("TRUE");
		else if(m==6 && (d>=1 && d<=20))
			System.out.println("TRUE");
		else
			System.out.println("False");
	}
}