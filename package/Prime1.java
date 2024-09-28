package mypack;
public class Prime1
{
	public void prime1(int n)
	{
		System.out.println("prime numbers are");
		int count=0;
		for(int i=2;count<n;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i+" ");
				count++;
			}
		}
	}
}