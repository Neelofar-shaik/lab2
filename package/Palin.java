package mypack;
import java.io.*;
class Palin
{
	public void palin(int n)
	{
		int r,sum=0,n1;
		n1=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==n1)
			System.out.println("palndrome");
		else
			System.out.println("not a palindrome");
	}
}