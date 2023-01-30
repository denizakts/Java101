package giris;

import java.util.Scanner;

public class PowCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int top=1,n;
		System.out.println("Bir sayi giriniz :");
		n=scan.nextInt();
		for(int i=1; i<=n; i*=4 )
		{
		System.out.println(i);
		
		}for (int i=1; i<=n; i*=5)
		{System.out.println(i);}	
	}
}
