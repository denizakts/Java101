package giris;

import java.util.Scanner;

public class Pattern {

	
	
	public static void pattern(int sayi)
	{
		
		System.out.println(sayi);
		if(sayi<=0)
		{
			return;
		}
	pattern(sayi-5);
	System.out.println(sayi);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sayi: ");
		int sayi = sc.nextInt();
		pattern(sayi);
	}

}
