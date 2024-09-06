import java.util.Scanner;
import java.util.ArrayList;
class RecursiveLinearSearch
{
  static int recursiveLinearSearch(int[] arr,int  key,int index)
 {
		 if (arr[index]==key)
		 {
			 return index;
		 }
		  
		 else if(index<arr.length)
		 {
			 
			 index++;
			 return recursiveLinearSearch( arr,  key,  index);
		 }
		 else 
		 {
			 return -1;
		 }
		 
	 }	

	
 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in) ; 
	 int n=sc.nextInt();
	 int [] array = new int[n];
	 for (int i =0 ; i<n;i++)
	 {
		 array[i]=sc.nextInt();
	 }
	 int key= sc.nextInt();
	 
	 System.out.print(recursiveLinearSearch(array,  key,  0));	
	 
	 
 }
}
