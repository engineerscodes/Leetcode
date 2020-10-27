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
public class Comp implements Comparator<String> {
/*  Compator
 *  * Compares its two arguments for order.  Returns a negative integer,
        * zero, or a positive integer as the first argument is less than, equal
        * to, or greater than the second.<p>
        *
 */
@Override
public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	return ((Integer.parseInt(o2+o1)>Integer.parseInt(o1+o2)?1:-1));
}

}

