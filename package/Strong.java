package mypack;
import java.io.*;
public class Strong
{
	public void strong(int n)
	{
		int i,fact,sum=0,digit=0,n1;
		n1=n;
		while(n1!=0)
		{
			i=1;
			fact=1;
			digit=n1%10;
			while(i<=digit)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			n1=n1/10;
		}
		if(n==sum)
			System.out.println("given number is strong");
		else
			System.out.println("given number is not strong");
	}
}