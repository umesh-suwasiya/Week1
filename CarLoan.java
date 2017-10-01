class CarLoan
{
    public static void main(String []arg)
    {
	    double principal=Double.parseDouble(arg[0]);
		double rate=Double.parseDouble(arg[1]);
		double year=Double.parseDouble(arg[2]);
		System.out.println("The entered principal is" +principal+ " rate is " +rate+ "and year is "+year);
	    double n=12*rate;
        double r=rate/(12*100);
        double pay=(principal*r)/(1-Math.pow(1+r,(-n)));

	   System.out.println("Payment="+pay);
   }
}