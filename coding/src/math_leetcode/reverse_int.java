package math_leetcode;

public class reverse_int {

	public static void main(String[] args) {
		
    Solution x=new Solution();
    System.out.println(x.reverse(2147483647));
	}

}

class Solution {
    public int reverse(int x)
    {   long sum=0;
        int flag=0;
        if(x<0)
        {
            flag=1;
            x=x*-1;
        }
        while(x>0)
        {  sum=sum*10+x%10;
            x=x/10;
        }
        if(sum>Integer.MAX_VALUE)
        	return 0;
     return (int) (flag==0?(int)sum:(int)-1*sum);
    }
}