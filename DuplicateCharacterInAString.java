import java.util.*;
import java.io.*;
public class DuplicateCharacterInAString
{
	public static void find(String s)
	{
		Map<Character,Integer> baseMap=new HashMap<Character,Integer>();
		char c[]=s.toCharArray();
		for(Character ch:c)
		{
			if(baseMap.containsKey(ch))
				baseMap.put(ch,baseMap.get(ch)+1);
			else
				baseMap.put(ch,1);
		}
		Set<Character> keys=baseMap.keySet();
		for(Character ch:keys)
			if(baseMap.get(ch)>1)
				System.out.println(ch+"="+baseMap.get(ch));
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
		find(s);	
		
	}
}