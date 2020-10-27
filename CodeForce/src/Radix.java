/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Radix 
{
   static Scanner nav=new Scanner(System.in);
	public static void main(String ...naveen)
	{
		System.out.println("Enter SIZE OF Array");
		int arr[]=new int[nav.nextInt()] ;
		for(int i=0;i<arr.length;i++)
			arr[i]=nav.nextInt();
	    Arrays.stream(arr).forEach(System.out::print);
	    System.out.println();
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		String strj=arr[j]+"";
	    		String stri=arr[i]+"";
	    		if(Integer.parseInt((strj+stri))>Integer.parseInt((stri+strj)))
	    		{  //System.out.println(strj+stri + "  "+stri+strj +" "+i+"  "+j );
	    			int c=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=c;
	    		}
	    	}
	    	
	    }
	    System.out.println();
	  //  Arrays.stream(arr).forEach(System.out::print);
	    System.out.println(" ->"+Arrays.toString(arr));
	    //2rd way to solve using Comparator 
	    //List x=Arrays.asList(arr);
	   /* List <String> x=new ArrayList();
	    for(int c:arr)
	    	x.add(c+"");
	    //System.out.println(x);
	    Collections.sort(x, (a,b)->(b+a).compareTo(a+b));
	    System.out.println(x);
	    */
	}
}
//{1, 34, 3, 98, 9, 76, 45, 4}
