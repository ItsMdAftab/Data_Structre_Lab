import java.util.Scanner; 
class SecoundLastDigit
{
	public static int getSecound(int number)
	{
		String j=Integer.toString(Math.abs(number));
		if (j.length()>=2)
		{
			
			int k = Math.abs(number%100);
			return k; 
		}
		else
		{
			return -1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		SecoundLastDigit obj = new SecoundLastDigit();
		System.out.print(obj.getSecound(number));
	}
}
		
