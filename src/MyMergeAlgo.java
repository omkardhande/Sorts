public class MyMergeAlgo 
{
 public static void main(String[] args) 
 {
  int[] A = new int[10];
  populateA(A);
  
  System.out.println("Before sorting");
  printA(A);
  A = merge_sort(A);
  System.out.println("after sorting");
  printA(A);
 }
 
 public static int[] merge_sort(int[] B)
 {
  if(B.length<=1)
  {
   return B;
  }
  int midpoint = B.length/2;
  int[] left = new int[midpoint];
  int[] right;
  if(B.length%2==0)
  {
   right=new int[midpoint];
   
  }
  else
  {
   right=new int[midpoint+1];
  }
  int[] result = new int[B.length];
  for(int i=0; i<midpoint; i++){
   left[i]=B[i];
  }
  int x=0;
  for(int j=midpoint; j<B.length; j++){
   if(x<right.length){
   right[x]=B[j];
   x++;
   }
  }
  left = merge_sort(left);
  right= merge_sort(right);
  result=merge(left, right);
  
  return result;
  
 }
 
 public static int[] merge(int[] left,int[] right){
  int lengthresult = left.length+right.length;
  int[] result = new int[lengthresult];
  int indexL=0;
  int indexR=0;
  int indexRes = 0;
  while(indexL<left.length|| indexR<right.length){
   if(indexL<left.length&&indexR<right.length){
    if(left[indexL]<=right[indexR]){
     result[indexRes]=left[indexL];
     indexL++;
     indexRes++;
    }else{
     result[indexRes]=right[indexR];
     indexR++;
     indexRes++;
    }
   }else if(indexL<left.length){
    result[indexRes]=left[indexL];
    indexL++;
    indexRes++;
    
   }else if(indexR<right.length){
    result[indexRes]=right[indexR];
    indexR++;
    indexRes++; 
   }
  }
  return result;
 }
 
 public static void printA(int[] s)
 {
  for(int i=0; i<s.length; i++)
  {
   System.out.println(s[i]+" ");
  }
 }
 
 public static int[] populateA(int[] s)
 {
  for(int i=0; i<s.length; i++)
  {
   s[i]=(int)(Math.random()*100);
  }
  return s;
 }
}