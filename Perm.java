import java.util.*;
import java.io.*;
public class Perm
{
	public static int arr[];
	public static ArrayList <Integer> permute=new ArrayList<Integer>();
	
	public static void permuteHelper(int i)
	{
		if(i==arr.length-1)
			for (int m:arr)
				permute.add(m);
		else
		{
			for(int j=i;j<arr.length;j++)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				permuteHelper(i+1);
				int s=arr[i];
				arr[i]=arr[j];
				arr[j]=s;
				
			}
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		permuteHelper(0);
		System.out.println(permute);
	}
}