import java.util.*;
import java.io.*;
public class SmallestDifference
{
	public static void smallDiff(int a[], int b[])
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0;
		int smallest=999;
		int current=999;
		int smallestPair[]= new int [2];
		while(i<a.length && j<b.length)
		{
			int f=a[i];
			int s=b[j];
			if(f<s)
			{
				current=s-f;
				i++;
			}
			else if(f>s)
			{
				current=f-s;
				j++;
			}
			else
			{
				System.out.print(f+" "+s);
				System.exit(0);
			}
			if(smallest>current)
			{
				smallest=current;
				smallestPair[0]=f;
				smallestPair[1]=s;
			}
		}
		System.out.println(smallestPair[0]+"	"+smallestPair[1]);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		smallDiff(a,b);
	}
}