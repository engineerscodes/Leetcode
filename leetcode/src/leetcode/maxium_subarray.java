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
public class maxium_subarray 
{   static Scanner nav=new Scanner(System.in);
    static  int num[];
   static  int size,sum,max;
    maxium_subarray(int size)
    {
    	this.size=size;
    	num=new  int[size];
    }
    
    private  static int  calmax(int beg,int end,int num[])
    {   
    	if(beg==size)
    	{
    	  return max;
    	}
    	else
    	{ int i=beg,j=end;
    	 while(i!=j)
    	 {   sum=0;
    		 for(int c=i;c<j;c++)
    		 {
    			 sum=sum+num[c];
    		 }
    		 j--;
    		 if(max<=sum)
    	    	{
    	    		max=sum;
    	    	}
    	 }
    	
    	 beg++;
    	return calmax(beg,end,num);
    	}
    }
    public static void main(String ...arg)
    {
    	System.out.println("Enter the size of array");
    	maxium_subarray n=new maxium_subarray(nav.nextInt());
    	input();
    }

	public static void input() 
	{
		for(int i=0;i<size;i++)
		{
			num[i]=nav.nextInt();
			
		}

		int x=calmax(0,size,num);
		  System.out.println(max); 
	}
}
