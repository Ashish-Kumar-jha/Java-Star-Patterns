package patterns;
import java.util.*;
public class pattern {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n,i;
		//DIAMOND PATERN & HALF CODE IS FOR TRIANGLE
		System.out.println("ENTER THE NO OF LINES OF STAR YOU WANT");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}                                                                                                               
			
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
		  System.out.print("\n");
		}
		
		for(i=n;i>0;i--)
		{
			if(i!=n) {
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println("");

		}
		}
		
		scan.close();
	}
}
