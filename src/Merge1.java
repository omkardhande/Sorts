
public class Merge1 
{
	public static void main(String[] args) 
	{
		int arr[] = {38,27,43,3,9,82,10};
		System.out.println(" Array");
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
		arr = mergesort(arr);
		System.out.println();
		System.out.println("The sorted array ");
		for(int i =0; i<arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
	public static int[] mergesort(int brr[])
	{
		int drr[] = new int[brr.length];
		if(brr.length <= 1)
		{
			return brr;
		}
		/*int mid = (brr.length/2) +(brr.length%2);
		int left[] = new int[mid];
		int right[] = new int[brr.length - mid];
		for (int i = 0;i<left.length;i++)
		{
			left[i] = brr[i];
		}
		for (int i = 0;i<right.length;i++)
		{
			right[i] = brr[i+mid];
		}*/
		  int midpoint = brr.length/2;
		  int[] left = new int[midpoint];
		  int[] right;
		  if(brr.length%2==0)
		  {
		   right=new int[midpoint];
		   
		  }
		  else
		  {
		   right=new int[midpoint+1];
		  }
		  for(int i=0; i<midpoint; i++){
		   left[i]=brr[i];
		  }
		  int x=0;
		  for(int j=midpoint; j<brr.length; j++){
		   if(x<right.length){
		   right[x]=brr[j];
		   x++;
		   }
		  }
		mergesort(left);
		mergesort(right);
		drr = merge(left,right);
		return drr;
	}
	public static int[] merge(int left[],int right[])
	{
		int i=0;int j=0;int k=0;
		int crr[] = new int [left.length + right.length];
		while(i<left.length && j<right.length)
		{
			if(left[i] <= right[j])
			{
				crr[k] = left[i];
				i++;
			}
			else
			{
				crr[k] = right[j];
				j++;				
			}
			k++;
		}
		while(i<left.length)
		{
			crr[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			crr[k] = right[j];
			j++;
			k++;
		}		
		return crr;
	}
}
