class Distance
{
    public static void main(String []arg)
    {
       int x,y;
	   double distance;
	   x = Integer.parseInt(arg[0]);
	   y = Integer.parseInt(arg[1]);
	   distance= Math.sqrt(x*x + y*y);
	   System.out.println("Euclidean distance="+distance);
	}
}