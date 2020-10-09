import java.util.*;
import java.io.*;
public class PascalI
{
	public static List<List<Integer>> generatePascal(int rows)
	{
		List<List<Integer>> result=new ArrayList<>();
		if(rows==0)
			return result;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					result.add(new ArrayList<>(i+1));
					result.get(i).add(1);
				}
				else if(j==i)
					result.get(i).add(i);
				else
					result.get(i).add(result.get(i-1).get(j-1)+result.get(i).get(j));
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(generatePascal(n));
	}
}