import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[5];
		for (int i =0 ; i<5;i++)
		{
			numbers[i]=sc.nextInt();
		}
		String k = sc.next();
		int even=0;
		for (int i =0;i<5;i++)
		{
			if (numbers[i]%2==0)
			{
				even+=1;
				//System.out.print("even"+even);
			}
		}
		int odd= 5-even;
		//System.out.print("odd"+odd);
		if (k.equals("odd"))
		{
			System.out.print(odd);
		}
		else
		{
			System.out.print(even);
		}
		
		
		
		
	}
}

		
		
