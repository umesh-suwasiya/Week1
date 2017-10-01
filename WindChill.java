class WindChill
{
    public static void main(String []arg)
    {
        
	   double t,v,w;
	   t = Integer.parseInt(arg[0]);
	   v = Integer.parseInt(arg[1]);
	   if(t>50 && (v>120 || v<3))
			System.out.println("Invalid input");
	   w =35.74 + 0.6215*t + (0.4275*t-35.75)* Math.pow(v,0.16);
	   System.out.println("Effective Temperature= "+w);
	 }
}