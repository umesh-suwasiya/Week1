class FlipCoin
{
static int head,tails,input,cnt,head_percent,tails_percent,total;
public static void main(String args[])
{
    head=0;
    tails=0;
    input=Integer.parseInt(args[0]);
        for(cnt=1;cnt<=input;cnt++)
        {             
        if(Math.random() < 0.5)
        {
			head++;
		}
		else 
		{
			tails++;
		}
			total++;
        }
        System.out.println("number of heads appeared is " +head+ " where number of tails are "+tails);
        head_percent=(head*100)/total;
        tails_percent=(tails*100)/total;
        System.out.println("percentage of heads appeared is " +head_percent+ 
							" where percentage of tails are "+tails_percent);
        }
  }