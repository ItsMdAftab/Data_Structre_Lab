/*1.8 Leaders in an array*/
/*
Array Initialiazation : 

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
		
class Learders_in_Array
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in) ;
		int n=sc.nextInt();
		int[] myArray=new int[n]; 
		for (int i=0 ;i<n;i++)
		{
			myArray[i]=sc.nextInt();
		}
		for (int i=0 ;i<n;i++)
		{
			for (int j =i+1 ; j<n;j++)
			{
				System.out.print(myArray[j]);
			}
			
		} 
	}
	
}
		
		
		

