package mypack;
import java.io.*;
public class Fib
{
	public void fib(int n)
	{
		int n1=0,n2=1,temp,i;
		System.out.print("Fibanocci series: ");
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++)
		{
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
		}
	}
}