import java.util.*;
import java.io.*;
public class HowManyNUmbersAreSmallerThanTheCurrentNumber
{
	public static int[] smallerNumber(int nums[])
	{
		TreeMap<Integer,Integer> count=new TreeMap<>();
		for(int i:nums)
			count.compute(i,(k,v)->v==null?1:v+1);
		int []smaller=new int[101];
		for(int i=0;i<=100;i++)
		{
			if(i==0)
				smaller[i]=0;
			else if(i==1)
				smaller[i]=smaller[i-1]+(count.get(i-1)==null?0:count.get(i-1));
			else
				smaller[i]=smaller[i-1]+(count.get(i-1)==null?0:count.get(i-1));
		}
		int res[]=new int[nums.length];
		for(int i=0;i<nums.length;i++)
			res[i]=smaller[nums[i]];
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int r[]=smallerNumber(a);
		for(int i=0;i<n;i++)
			System.out.println(r[i]);
	}
}