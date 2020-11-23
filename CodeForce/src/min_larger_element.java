/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class min_larger_element
{
    int array[];
	public min_larger_element() 
	{
		array=new int[] {8,1,2,2,3};
	}
    public void insert()
    {   int temp[]=new int[101];
    	for(int i=0;i<array.length;i++)
    		temp[array[i]]++;
    	 for(int j=1;j<101;j++)
    	 {
    		 temp[j]+=temp[j-1];
    	 }
    	 
    	 for(int i=0;i<array.length;i++)
    	 {
    		 array[i]=array[temp[i]-1];
    	 }
    	System.out.println("==="+Arrays.toString(array));
    }
	public static void main(String[] args) 
	{
		new min_larger_element().insert();
	}

}

