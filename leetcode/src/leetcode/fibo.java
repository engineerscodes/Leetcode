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
public class fibo
{  static Scanner nav=new Scanner(System.in);

	public static int fibos(int N)
	{
		if(N<=1)
			return N;
		//System.out.println(" -"+ fibos(N-1)+" "+fibos(N-2)+" n"+N);
		return fibos(N-1)+fibos(N-2);
	}
	public static void main(String ...strings)
	{
		int x=fibos(nav.nextInt());
		System.out.println(x);
	}
}
