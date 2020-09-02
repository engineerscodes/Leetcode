import java.util.*;
public class Team 
{ static Scanner nav=new Scanner (System.in);
  static int array[][],n,count,cones;  
	public static void main(String[] args) 
	{
		 n=nav.nextInt();
		 array=new int[n][3];
		 for(int i=0;i<n;i++)
		    for (int j=0;j<3;j++)
		       array[i][j]=nav.nextInt();
		 
		 for(int i=0;i<n;i++)
		 {      cones=0;
			    for (int j=0;j<3;j++)
			    {
			    	if(array[i][j]==1)
			    	  cones++;
			    }
			    if(cones>=2)
			    {
			    	count++;
			    }
		
		 }
		 System.out.println(count);
	}

}
