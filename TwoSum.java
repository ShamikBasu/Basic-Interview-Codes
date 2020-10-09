import java.util.*;
import java.io.*;
public class TwoSum
{
	public static void twoNoSum(int a[], int t)
	{
		Arrays.sort(a);
		ArrayList<List<Integer>> duplets=new ArrayList<>();
		
			int left=0;
			int right=a.length-1;
			while(left<right)
			{
				int currSum=a[left]+a[right];
				if(currSum==t)
				{
					ArrayList <Integer> l=new ArrayList<>();
					l.add(a[left]);
					l.add(a[right]);
					duplets.add(l);
					left++;
					right--;
				}
				else if(currSum<t)
					left++;
				else if(currSum>t)
					right--;
			}
		System.out.println(duplets);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int t=sc.nextInt();
		twoNoSum(a,t);
	}
}