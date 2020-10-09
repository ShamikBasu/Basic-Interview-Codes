import java.util.*;
import java.io.*;
public class ThreeSum
{
	public static void threeNoSum(int a[], int t)
	{
		Arrays.sort(a);
		ArrayList<List<Integer>> triplets=new ArrayList<>();
		for(int i=0;i<a.length-2;i++)
		{
			int left=i+1;
			int right=a.length-1;
			while(left<right)
			{
				int currSum=a[i]+a[left]+a[right];
				if(currSum==t)
				{
					ArrayList <Integer> l=new ArrayList<>();
					l.add(a[i]);
					l.add(a[left]);
					l.add(a[right]);
					triplets.add(l);
					left++;
					right--;
				}
				else if(currSum<t)
					left++;
				else if(currSum>t)
					right--;
			}
		}
		System.out.println(triplets);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int t=sc.nextInt();
		threeNoSum(a,t);
	}
}