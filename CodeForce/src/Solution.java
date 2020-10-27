class Solution {
	String temp="";
    public boolean reverse(int x) 
    {   
    	String t= x+"";
        String str[]=t.split(""); 
        for(String c:str)
            temp=c+temp;
    System.out.println(temp);
    if(t.equals(temp))
        return true;
    else
        return false;
    
    }
   
    
    public static void main(String ...arg)
    {
    	Solution n=new Solution();
    	boolean d=n.reverse(2147483647);
    	System.out.println(d);
    }
}