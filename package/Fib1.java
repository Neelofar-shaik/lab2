package mypack;
import java.io.*;
public class Fib1
{
	public void fib1(int n)
	{
		int n1=0,n2=1,temp,i;
		System.out.print("Fibanocci series: ");
		System.out.print(n1+" "+n2);
		while((n1+n2)<n)
		{
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
		}
	}
}