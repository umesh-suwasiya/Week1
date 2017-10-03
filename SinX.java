import java.io.*;
class SinX
{
  public double fact(int d)
  {
    int i;
    double fact=1;
    for(i=d;i>0;i--)
    {
      fact = fact*i;
    }
    return fact;
  }
  public static void main(String[] args)
  {
      SinX s = new SinX();
      int i;
      double x,temp;
      x = Double.parseDouble(args[0]);
      double sin_X=0.0000d;
      x = (x*Math.PI)/180.0;
      System.out.println(x);
      sin_X = x;
      int denom;
      for(i=2,denom=3;i<=4;i++,denom=denom+2)
      {
        if(i%2==0)
        {
          temp = -(Math.pow(x,denom)/s.fact(denom));
        }
        else
        {
          temp = Math.pow(x,denom)/s.fact(denom);
        }
          sin_X = sin_X + temp;
      }
      System.out.println("Value of Sin x using taylor series = "+sin_X);
  }
}
