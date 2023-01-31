package giris;

public class Diamond {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++)
		{
			
			for(int b=5; b>=i; b--)
			{
				System.out.print(" ");
			}
			for(int y=1; y<=1+i*2; y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");			
		}	
		for(int i=6; i>=0; i--)
		{
			
			for(int b=0; b<6-i; b++)
			{
				System.out.print(" ");
			}
			for(int y=1; y<=1+i*2; y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
				
		}

	}

}
