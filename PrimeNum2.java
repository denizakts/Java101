package giris;

import java.util.Scanner;

public class PrimeNum2 {

	public static void Prime()
	{
		Scanner sc = new Scanner(System.in);
		int sayi;
		while(true)
		{System.out.println("Sayi giriniz :");
		sayi=sc.nextInt();
		if(sayi>1 && (sayi==2 || sayi==3 || sayi==5 || sayi==7))
		{
			System.out.println("ASAL!");
		}else if(sayi>10)
		{
			if(sayi%2==0 || sayi%3==0 || sayi%5==0 || sayi%7==0)
			{
			System.out.println("ASAL DEGIL!");}
			else
				System.out.println("ASAL");
		}else
		{
			System.out.println("ASAL DEGIL!");
		}
		}
		
	}
	public static void main(String[] args) {
		Prime();		
	}

}
