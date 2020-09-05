/**
 * 
 */
package leetcode;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class findmaxones {
	/**
	 * 
	 */
	static Scanner nav=new Scanner(System.in);
	static int a[][];
	int m,n;
	public findmaxones(int m,int n) 
	{
		a=new int[m][n];
		this.m=m;
		this.n=n;
	}
	public int  max()
	{  int max=0;
	   int count=0;
		for(int i=0;i<m;i++)
		{   count=0;
			for(int j=0;j<n;j++ )
			{
				if(a[i][j]==1)
				{   count++;
					if(max<=count)
					{	max=count;
					//System.out.println(max);
					}
				}
			}
		}
		return max;
	}
    public static void main(String ...naveen)
    {   System.out.println("enter number of roes and columns");
    	findmaxones one=new findmaxones(nav.nextInt(),nav.nextInt());
    	for(int i=0;i<3;i++)
    		for(int j=0;j<3;j++)
    			a[i][j]=nav.nextInt();
    	
    	for(int i=0;i<one.m;i++)
    	{
    		for(int j=0;j<one.n;j++)
    			System.out.print(a[i][j]);
    		System.out.println();
    	}
    	System.out.println(one.max());
    	
    }
}
