/**
 * 
 */
package leetcode;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class AP_slices 
{  Scanner nav=new Scanner(System.in);
    int array[];
	public AP_slices(int size) 
	{
		array=new int[size];
	}
   public void input()
   {  int d=0;
   String x="101";
           Integer f=Integer.parseInt(x,2);
         System.out.println("============"+f);
       
        
	   for(int i=0;i<array.length;i++)
		   array[i]=nav.nextInt();
	   System.out.println(Arrays.toString(array));
	 //
	   int c=0;
	   for(int i=0;i<array.length-1;i++)
	   {   d=array[i]-array[i+1];
		   for(int j=i+1;j<array.length-1;j++)
		   {
			   if(d==array[j]-array[j+1])
				  System.out.println(++c);
			   else
				   break;
		   }
	   }
   }
   
	public static void main(String[] args)
	{
		new AP_slices(4).input(); 
	}

}

