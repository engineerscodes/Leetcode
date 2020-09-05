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
public class Consecutive_Ones {



	 public void findMaxConsecutiveOnes(int[] n) 
	    {   int max=0; 
	      ArrayList n1=new ArrayList();
	    for(int i=0;i<n.length;i++)
	    {
	        if(n[i]==1)
	        {
	            n1.add(1);
	            if(max<=n1.size())
	                max=n1.size();
	        }
	        else
	        {
	            n1.clear();
	        }
	    }
	    System.out.println(max);
	    }

	 public static void main(String ...arg)
	 {
		 Consecutive_Ones one=new Consecutive_Ones();
		 int x[]={1,1,0,1,1,1,0,1,1,1,1,1,1,0,1};
		 one.findMaxConsecutiveOnes(x);
	 }
}
