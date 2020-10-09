import java.util.*;
import java.io.*;
import java.math.*;
public class StringRotationToFindAnother
{
	public static boolean rotateString(String A, String B)
	{
		if(A.equals(B))
			return true;
		if(A.length()!=B.length())
			return false;
		for(int i=0;i<A.length();i++)
		{
			String T=A.substring(1,A.length()-1)+A.charAt(0); 
			if(T.equals(B))
				return true;
			A=T;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(rotateString(A,B));
	}
}