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
public class movezeros 
{
   static int n[]={0,0,0,1,0,0,0,5};
   static int size;
   public movezeros(int size) 
	{
		this.size=size;
		
	}
 public static void move()
 { List<Integer> n1=new ArrayList<Integer>();
   
   for(int i=0;i<n.length;i++)
   {
	   n1.add(n[i]);
   }
   Iterator i=n1.iterator();
   while(i.hasNext())
   {
	   if(i.next().equals(0))
		   i.remove();
   }
  
  int sub=n.length-n1.size();
  System.out.println(sub);
  for(int c=0;c<sub;c++)
	  n1.add(0);
  System.out.println(n1);
 }
 
 public static void main(String ...nav)
 {  movezeros  obj =new movezeros (8);
	move();
 }
}
