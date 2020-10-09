import java.util.*;
import java.io.*;
import java.math.*;
public class MaxProfitKTransaction
{
	
	public static int maxProfitKtransaction(int []prices,int k)
	{
		if(prices.length==0)
			return 0;
		int evenProfits[]=new int[prices.length];
		int oddProfits[]=new int[prices.length];
		int prevProfits[],currentProfits[];
		for(int i=0;i<=prices.length-1;i++)
		{
			oddProfits[i]=evenProfits[i]=0;
		}
		for(int t=1;t<=k+1;t++)
		{
			int maxThusFar=-999;
			if(t%2!=0)
			{
				currentProfits=oddProfits;
				prevProfits=evenProfits;
			}
			else
			{
				currentProfits=evenProfits;
				prevProfits=oddProfits;
			}
			for( int d=1;d<prices.length;d++)
			{
				maxThusFar=Math.max(maxThusFar,prevProfits[d-1]-prices[d-1]);
				currentProfits[d]=Math.max(currentProfits[d-1],maxThusFar+prices[d]);
			}
		}
		if(k%2==0)
			return evenProfits[prices.length-1];
		else
			return oddProfits[prices.length-1];

	}
	public static void main(String args[])
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int k=0,n=0;
		System.out.println("ENTER THE NUMBER OF TRANSACTIONS\n");
		try
		{
		k= Integer.parseInt(inp.readLine());
		n= Integer.parseInt(inp.readLine());
		}
		catch(Exception e1){}
		int a[]=new int[n];
		try{
		for(int i=0;i<n;i++)
		{	
			a[i]=Integer.parseInt(inp.readLine());	
		}
		}
		catch(Exception e2){}
		
		System.out.println("MAX PROFIT ="+maxProfitKtransaction(a,k));
	}
}