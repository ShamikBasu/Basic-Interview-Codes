import java.util.*;
import java.io.*;
import java.math.*;
public class soham
{
static int len;
public static int[] convert(String s)
{
char[] c= s.toCharArray();
len=c.length;
int[] a= new int[len];
int i,j=0;
for(i=0;i<len;i++)
{
if(Character.isDigit(c[i]))
a[j] = Character.getNumericValue(c[i]);
else
{
a[j] = c[i];
a[j] = a[j] - 55;
}
j++;
}
j--;
return a;
}
static int  findBase(int[] arrMax)
{
int max=arrMax[0];
for(int i=1;i<arrMax.length;i++)
{
if(max<arrMax[i])
max=arrMax[i];
}
return max+1;
}

public static void main(String args[])
{
int a[]=new int[10];
int decimal = Integer.MAX_VALUE;
String str;
int i,j,k,l;
Scanner sc=new Scanner(System.in);
str = sc.nextLine();
String[] array = str.split(" ");
for(i=0;i<array.length;i++)
{
int[] valArr = convert(array[i]);
int base = findBase(valArr);
int power=valArr.length;
double sum=0;
for(j=power-1,k=0; j>=0 && k<power; j--,k++)
{
sum = sum+ ( valArr[k]*Math.pow(base,j) );
}
if(sum<decimal)
decimal=(int)sum;
}
System.out.println(decimal);
}}