import java.util.*;
public class Watermelon 
{   static Scanner nav=new Scanner(System.in);
     static int a;
	public static void main(String[] args) 
	{
		 a=nav.nextInt();
		 if(a>2)
		 {
		 if(a%2==0)
				 System.out.println("YES");
			 else 
				 System.out.println("NO"); 
		 }
		 else 
			 System.out.println("NO"); 
	}

}
