
import java.io.*;
import java.util.*;
public class Insertion {
	public static void main(String[] args)throws IOException
	{
		int i=0; int j=0;int temp=0;
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		int n=Integer.parseInt(in.readLine());
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(in.readLine());
		}
		for(i=1;i<n;i++)
		{
			j=i;
			while(j>0 && (arr[j]<arr[j-1]))
			{
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
		System.out.println("Sorted array:");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
