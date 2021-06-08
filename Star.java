
import java.util.*;
class Star
{
	public static void main(String args[])
	{
          int i,j,n;
          System.out.println("enter no. of stars:");
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          for(i=0;i<n;i++)
	  {
           for(j=0;j<=i;j++)
               System.out.print("*");
	       System.out.println("\n");
	   
          }
          
         }
}

          