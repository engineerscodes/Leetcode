class Solution {
    public int reverse(int x) 
    {   
        int sum=0;
        int n,num=x;
     
      if(x>0)
     {   
         while(num>0)
         {
             n=num%10;
             sum=sum*10+n;
             num=num/10;
         }
         return sum;
    }
    else
    {   
        x=Math.abs(x);
        int r,q,sum2=0;
        q=x;
        while(q>0)
        {
            r=q%10;
            sum2=sum2*10+r;
            q=q/10;
        }
        return ((sum2)*(-1));
    }
    
    }
   
    
    public static void main(String ...arg)
    {
    	Solution n=new Solution();
    	int d=n.reverse(-2147483412);
    	System.out.println(d);
    }
}