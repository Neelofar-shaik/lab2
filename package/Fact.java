package mypack;
import java.io.*;
public class Fact
{
	public void fact(int n)
	{
		int f=1;
		for(int i=n;i>=1;i--)
			f=f*i;
		System.out.println("factorial of given number is "+f);
	}
}