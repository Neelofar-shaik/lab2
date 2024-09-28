package mypack;
import java.io.*;
public class Amstrong
{
	public void amstrong(int n)
	{
		int sum=0,digit=0,n2,n1;
		n1=n;
		while(n1>0)
		{
			n1=n1/10;
			digit++;
		}
		n1=n;
		while(n1>0)
		{
			n2=n1%10;
			sum+=(Math.pow(n2,digit));
			n1=n1/10;
		}
		if(n==sum)
		{
			System.out.println("given number is amstrong");
		}
		else
			System.out.println("given number is not amstrong");
	}
}