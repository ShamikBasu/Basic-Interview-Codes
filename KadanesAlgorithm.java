import java.util.*;
import java.io.*;


public class KadanesAlgorithm
{
	public static int maxSumInSubarray(int array[])
	{
		int maxEndingHere=array[0];
		int maxSoFar=array[0];
		for(int n=1;n<array.length;n++)
		{
			maxEndingHere=Math.max(maxEndingHere+array[n],array[n]);
			maxSoFar=Math.max(maxSoFar,maxEndingHere);
		}
		return maxSoFar;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		System.out.println(maxSumInSubarray(array));
	}
}