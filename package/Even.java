package mypack;
import java.io.*;
public class Even
{
	public void even(int n)
	{
		System.out.println("even numbers are");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i+" ");
		}
	}
}