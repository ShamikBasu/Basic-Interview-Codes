import java.io.*;
import java.util.*;
public class MergeSort
{
	static int fin[];
	public static int mergeSort(int array[])
	{
		if(array.length<=1)
			return 0;
		int auxilliaryArray[]=array.clone();
		mergeSortHelper(array,0,array.length-1,auxilliaryArray);
		return 1;
		
	}
	public static void mergeSortHelper(int mainArray[],int startIdx,int endIdx,int []auxArray)
	{
		if(startIdx==endIdx)
			return;
		int middleIdx=(startIdx+endIdx)/2;
		mergeSortHelper(auxArray,startIdx,middleIdx,mainArray);
		mergeSortHelper(auxArray,middleIdx+1,endIdx,mainArray);
		doMerge(mainArray,startIdx,middleIdx,endIdx,auxArray);
	}
	public static void doMerge(int mainArray[],int startIdx,int middleIdx,int endIdx,int auxArray[])
	{
		int k=startIdx;
		int i=startIdx;
		int j=middleIdx+1;
		while(i<=middleIdx && j<=endIdx)
		{
			if(auxArray[i]<=auxArray[j])
			{
				mainArray[k]=auxArray[i];
				i++;
			}
			else
			{
				mainArray[k]=auxArray[j];
				j++;
			}
			k++;
		}
		while(i<=middleIdx)
		{
			mainArray[k]=auxArray[i];
			i++;
			k++;
		}
		while(j<=middleIdx)
		{
			mainArray[k]=auxArray[j];
			j++;
			k++;
		}
		fin=mainArray.clone();	
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<=9;i++)
			a[i]=sc.nextInt();
		if(mergeSort(a)==1)
			{
				for(int i=0;i<fin.length;i++)
					System.out.print(fin[i]+"	");
			}
		
	}
	
}