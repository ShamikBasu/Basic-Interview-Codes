import java.util.*;
import java.io.*;
public class SearchSortedMatrix
{
	public static int[] search(int m[][],int t)
	{
		int r=0;
		int c=m[0].length-1;
		int val[]=new int[2];
		val[0]=-1;
		val[1]=-1;
		while(r<m[0].length && c>=0)
		{
			if(t<m[r][c])
				c--;
			else if(t>m[r][c])
				r++;
			else
			{
				val[0]=r;
				val[1]=c;
				return val;
			}
		}
		return val;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m[][]=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				m[i][j]=sc.nextInt();
		int t=sc.nextInt();
		int res[]=search(m,t);
		System.out.println(res[0]+"	"+res[1]);
	}
}