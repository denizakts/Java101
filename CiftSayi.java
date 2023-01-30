package giris;

import java.util.Scanner;

public class CiftSayi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sayi;
		System.out.println("Bir sayi belirtiniz :");
		sayi=input.nextInt();
		for (int i=1; i<=sayi; i++)
		{
			if(i%2==0)
			{
				System.out.println("Cift sayi : "+i);
			}
			else 
				System.out.println("Tek sayi : " +i);
		}
		
		
	}

}
