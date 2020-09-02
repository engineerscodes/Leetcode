/**
 * 
 */
import java.util.*;
import java.math.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class be_matrix //implements Iterator error u have to implements hasnest ,next ,remove
{  static int a[][];
   static Scanner nav=new Scanner(System.in);
	public be_matrix() 
	{
		a=new int[5][5];
	}
	public static void input()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
				a[i][j]=nav.nextInt();		
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
				System.out.print(a[i][j]+" ");	
			System.out.println();
		}
		min();
	}
	
	public static void min()
	{   int r,c;
	r=-1;
	c=-1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i][j]==1)
				{
					r=i;
					c=j;
					break;
				}
			}
		}
		if(r==-1&&c==-1)
		{
			System.out.println("Not possible bro");
			return;
		}
		System.out.println("the number of rows to swap="+Math.abs(2-r));
		System.out.println("the number of colunms to swap="+Math.abs(2-c));
		
	}
public static void main(String ...arg)
{
	be_matrix n =new be_matrix();
	input();
}
}
