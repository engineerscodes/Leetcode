package math_leetcode;
import java.math.BigInteger;
import java.util.ArrayList;
public class number_of_prime 
{

	public static void main(String[] args) 
	{  int c=0;
	ArrayList<Object> n=new ArrayList<>();
		for(int i=0;i<50000;i=i+2)
		{BigInteger b = new BigInteger(String.valueOf(i)); 
       String x= b.nextProbablePrime().toString();
      if( n.contains(x)==false && Integer.parseInt(x)<50000)
      {
        n.add(x);
      }
   
		}
		System.out.println("prime :"+n.size());
	}

}
