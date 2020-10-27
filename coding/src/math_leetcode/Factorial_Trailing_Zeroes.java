package math_leetcode;

import java.util.Scanner;

public class Factorial_Trailing_Zeroes 
{  static Scanner nav=new Scanner(System.in);

	public static void main(String[] args) 
	{
		Solution2.trailingZeroes(nav.nextInt()); 
	}

}
class Solution2
{
    public static long trailingZeroes(int n) 
    {  int sum=0;
       //long a= f(n);
       //System.out.println(a);
       //System.out.println(n/5);
       int i=1;
       while(true)
       {
    	  int p=(int)Math.pow(5,i++);
    	  if(n/p==0)
    		  break;
    	  sum=sum+n/p;
       }
       System.out.println(sum);
        return 1;
    }
    public static long f(int n)
    {
       if(n==1)
           return 1;
       System.out.println(n+" "+(n-1));
        return n*f(n-1);
    }
}