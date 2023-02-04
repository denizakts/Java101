package giris;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	for (int i=2; i<100; i++)
	{
		if(i>=2 && i<4)
		{
			System.out.println(i);
		}
		if(i>4 && i<10)
		{
			if(i%2!=0 && i%3!=0)
			{
				System.out.println(i);
			}
		}

		if(i>10)
		{
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
			{
				System.out.println(i);
			}
		}
		
	}

	}

}
