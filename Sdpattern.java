import java.util.*;
class Sdpattern
{
public static void main(String args[])
{
	int i,j,n;
	int count=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows: ");
	n=sc.nextInt();
	for(i=1; i<=n; i++)
	{
        	for(j=1; j<=i; j++)
		{
  		if((i+j)%2==1)
		{
      		System.out.print("$\t");
                }
  		else
		{
      		System.out.print("@\t");
                }
		}
	System.out.println();
        System.out.println("\t");
	}
}
}
