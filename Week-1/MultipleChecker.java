import java.util.Scanner; 
class MultipleChecker
{
	public static int checkMultiple(int num1, int num2)
	{
		if (num1%num2==0)
		{
			int k= Math.abs(num1/num2);
			return k; 
		}
		else
		{
			return 1 ;
		}
	}
	public static void main(String args[])
	{
		MultipleChecker obj= new MultipleChecker();
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(obj.checkMultiple(num1 ,num2));
	}
}
		
		
			
			
			
			
			
		
