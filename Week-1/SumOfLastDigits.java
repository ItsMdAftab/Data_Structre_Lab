import java.util.Scanner ;
class SumofLastDigits
{
	int addLastDigits(int n1 , int n2 ) 
	{
		int k=Math.abs(n1%10);
		int l=Math.abs(n2%10);
		int sum =k + l;
		return sum;
	}
	public static void main(String args[])
	{
		SumofLastDigits obj = new SumofLastDigits();
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.print(obj.addLastDigits(n1,n2));
		
}
}