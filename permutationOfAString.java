import java.util.*;
import java.io.*;
public class permutationOfAString
{
	public static String swap(String s,int i,int j)
	{
		char c[]=s.toCharArray();
		char t;
		t=c[i];
		c[i]=c[j];
		c[j]=t;
		return String.valueOf(c);
	}



	private static void permute(String s,int l,int r)
	{
		if(l==r)
			System.out.println(s);
		else
		{
			for(int i=l;i<=r;i++)
			{
				s=swap(s,l,i);
				permute(s,l+1,r);
				s=swap(s,l,i);
			}
		}
	}
	public static void main(String args[])
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		System.out.println("ENTER THE STRING");
		try
		{
			s=inp.readLine();
		}
		catch(Exception e){}	
		permute(s,0,s.length()-1);	
		
	}
}