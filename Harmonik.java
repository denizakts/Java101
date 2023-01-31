package giris;

import java.util.Scanner;

public class Harmonik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n,total=0;
		System.out.println("Bir sayi giriniz : ");
		n=sc.nextDouble();
		for(double i=1; i<=n; i++)
		{
			total+=(1/i);
		}
		System.out.println(total);
	}

}
