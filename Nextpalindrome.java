import java.util.*;
import java.io.*;

public class Nextpalindrome 
{ 
	static void generateNextPalindromeRest(int num[], int n) 
	{ 
		int mid = n / 2; 
		int i = mid - 1; 
		int j = (n % 2 == 0) ? mid : mid + 1; 
		boolean leftsmaller = false; 
		while (i >= 0 && num[i] == num[j]) 
		{ 
			i--; 
			j++; 
		} 
		if (i < 0 || num[i] < num[j]) 
		{ 
			leftsmaller = true; 
		} 
		while (i >= 0) 
		{ 
			num[j++] = num[i--]; 
		} 
		if (leftsmaller) 
		{ 
			int carry = 1; 
			if (n % 2 == 1) { 
				num[mid] += 1; 
				carry = num[mid] / 10; 
				num[mid] %= 10; 
			} 
			i = mid - 1; 
			j = (n % 2 == 0 ? mid : mid + 1); 
			while (i >= 0 && carry>0) 
			{ 
				num[i] = num[i] + carry; 
				carry = num[i] / 10; 
				num[i] %= 10; 
				num[j] = num[i];// copy mirror to right 
				i--; 
				j++; 
			} 

		} 
	}  
	static void generateNextPalindrome(int num[], int n) 
	{ 
		System.out.println("Next Palindrome is:"); 
		if (isAll9(num, n)) { 
			System.out.print("1"); 
			for (int i = 0; i < n - 1; i++) 
				System.out.print("0"); 
			System.out.println("1"); 

		} 
	
		else { 
			generateNextPalindromeRest(num, n); 
			printarray(num); 
		} 
	} 
	static boolean isAll9(int num[], int n) { 
		for (int i = 0; i < n; i++) 
			if (num[i] != 9) 
				return false; 
		return true; 
	} 
	static void printarray(int num[]) { 
		for (int i = 0; i < num.length; i++) 
			System.out.print(num[i]); 
		System.out.println(); 
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String temp = Integer.toString(n);
		int[] num= new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
    			num[i] = temp.charAt(i) - '0'; 
		generateNextPalindrome(num, num.length); 
	} 
} 
