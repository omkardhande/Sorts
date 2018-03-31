import java.io.*;
import java.util.*;
public class Bubble {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		int n=Integer.parseInt(in.readLine());
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(in.readLine());
		}
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
