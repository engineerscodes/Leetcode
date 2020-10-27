/**
 * 
 */
package leetcode;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class addnum {

	public static void main(String[] args) 
	{    
		int num=295;
		int n=0,sum=0;
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
     System.out.println(sum);
	}

}
