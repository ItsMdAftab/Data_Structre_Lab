import java.util.Scanner;
class BinarySearch 
{
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
	 boolean k=false;
	 int index=0;
	 while(low<=high)
	 {
		int mid = low+(high-low)/2;
		if (array[mid]==key)
		{
			index=mid;
			k=true;
			break;
		}
		if(array[mid]<key)
		{
			low=mid+1;
		}
		else if (array[mid]>key)
		{
			high=mid-1;
		}
		
			
	 }
	 if (k)
	 {
		 System.out.print(index);
	 }
	 else
	 {
		 System.out.print(-1);
	 }
	 
	 
 }
 }