/**
 * 
 */
package Contest_32;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class q1
{
    
	public static void main(String[] args) 
	{
		int n=25050005;
		String s="".valueOf(n);
		String output="";
		System.out.println(s);
		String arr[]=s.split("");
		int count=0;
		for(int i=arr.length-1;i>=0;i--)
		{   count++;
			output=arr[i]+output;
			if(count%3==0&& count!=0)
				output=","+output;
			
		}
		System.out.println(output);		
	}

}

