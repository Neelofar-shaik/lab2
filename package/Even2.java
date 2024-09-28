package mypack;
import java.io.*;
public class Even2
{
	public void even2(int n)
	{
		int count=1;
		int num=0;
		do
		{
			System.out.println(num+" ");
			num+=2;
			count++;
		}while(count<=n);
	}
}