import java.util.*;
public class Way_Too_Long_Words 
{  static Scanner nav=new Scanner (System.in);
   static  String s[];
   Way_Too_Long_Words (int n)
    { s=new String[n];}
	public static void main(String[] args) 
	{
		int n=nav.nextInt();
		 Way_Too_Long_Words w=new  Way_Too_Long_Words(n);
		for(int i=0;i<s.length;i++)
		{
			s[i]=nav.next();
		}
        
		for (int i=0;i<s.length;i++)
		{    int l=s[i].length();
			if(s[i].length()>10)
			{
			 String	temp[]=s[i].split("");
			 char f=temp[0].charAt(0);
			 char last=temp[l-1].charAt(0);
			 String temp2=Character.toString(f)+Integer.toString(l-2)+Character.toString(last);
			 s[i]=temp2;
			}
		}
		for (int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}

}
