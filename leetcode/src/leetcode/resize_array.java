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
public class resize_array 
{   static int n[][];
     static int r,c;
     static Scanner nav=new Scanner(System.in);
	public resize_array(int r,int c) 
	{   this.r=r;
	    this.c=c;
        n=new int[r][c];
	}
	public static void input()
	{    //System.out.println()
		for(int i=0;i<n.length;i++)
			for(int j=0;j<n[0].length;j++)
			{
				n[i][j]=nav.nextInt();
			}
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n[0].length;j++)
			{
				System.out.print(n[i][j]+" , ");
			}
			System.out.println();
		}
	}
    public static int[][] resize(int r,int c)
    {  int dr=0,dc=0;
        int t[][]=new int[r][c];
    	int f1=0,f2=0;
    	ArrayList alist=new ArrayList();
    	for(int i=0;i<n.length;i++)
			for(int j=0;j<n[0].length;j++)
			{
				alist.add(n[i][j]);
			}
    	System.out.println("arraylist "+alist);
    	int x=0;
    	try{
    	for( f1 =0;f1<r;f1++)
    	{
    		for( f2=0;f2<c;f2++)
    			{t[f1][f2]=(Integer)alist.get(x);
    			  x++;
    			}
    		
    	}}
    	catch(IndexOutOfBoundsException e)
    	{
    		return n;
    	}
    	for(int i=0;i<t.length;i++)
		{
			for(int j=0;j<t[0].length;j++)
			{
				System.out.print(t[i][j]+" , ");
			}
			System.out.println();
		}
    	return t;
    }
	public static void main(String[] args) 
	{
		resize_array s=new resize_array(nav.nextInt(),nav.nextInt());  
		input();
		resize(2,4);
	    int x[]={1,-2,-3,5,-7};
	    Arrays.sort(x);
	    System.out.println(Arrays.toString(x));
	}

}
