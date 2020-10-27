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
public class Gratest_number_comparator 
{
    public static void main(String ...naveen)
    {
    	List <String> n=new ArrayList<>();
    	String a[]= {"54","546","548","60"};
    	n=Arrays.asList(a);
    	 Comparator<String> c=new Comp();
       Collections.sort(n, c);
       System.out.println(n);
    }
}

