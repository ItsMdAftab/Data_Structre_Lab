import java.util.Scanner;
public class pac 
{
 public static int recursiveBinarySearch(int[] array, int key, int low, int high)
 {
	 
	 
	 int mid = low+(high-low)/2;
	 if (array[mid]==key)
		{
			return mid ; 
		}
	else if(array[mid]<key)
		{
			low=mid+1;
			return recursiveBinarySearch(array, key,  low,  high);
		}
	else if (array[mid]>key)
		{
			high=mid-1;
			return recursiveBinarySearch(array, key,  low,  high);
		}
	else 
	{
		return -1;
	}
					
 }

 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 int [] array= new int[n];
	 for (int i=0 ;i<n;i++)
	 {
		 array[i]=sc.nextInt();
	 }
	 int key=sc.nextInt();
	 int low=0;
	 int high=n-1;
	 
	 int k=recursiveBinarySearch(array, key,  low,  high);
	 System.out.print(k);
 }
}