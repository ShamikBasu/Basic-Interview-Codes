import java.util.*;
import java.io.*;
import java.math.*;
public class ContainerWithMostWater
{
	public static int maxArea(int []height)
	{
		int l=0,r=height.length-1, area=0;
		while(l<r)
		{
			area=Math.max(area,Math.min(height[l],height[r])*(r-1));
			if(height[l]<height[r])
				l++;
			else
				r--;
		}
		return area;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int height[]=new int[n];
		for(int i=0;i<n;i++)
			height[i]=sc.nextInt();
		System.out.println(maxArea(height));
	}
}