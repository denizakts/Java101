package giris;

import java.util.Scanner;

public class UcgenHesap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a,b,c,u,alan,cevre;
		System.out.println("a kenari uzunlugunu giriniz.");
		a= input.nextDouble();
		System.out.println("b kenari uzunlugunu giriniz.");
		b=input.nextDouble();
		System.out.println("c kenari uzunlugunu giriniz.");
		c=input.nextDouble();
		u=(a+b+c)/2;
		cevre=2*u;
		alan=(u*(u-a)*(u-b)*(u-c));
		alan = Math.sqrt(alan);
		
		System.out.println("Cevre :" +cevre);
		System.out.println("Alan :"+alan);
	}

}
