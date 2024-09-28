package mypack;
import java.io.*;
class Prime2
{
	public void prime2(int n)
	{
		int i=1,count=0;
		System.out.println("Prime numbers are");
		while(i<=n)
		{
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2)
			System.out.println(i+" ");
	}
}