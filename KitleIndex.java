package giris;

import java.util.Scanner;

public class KitleIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kilo,boy;
		System.out.println("Lutfen kilonuzu giriniz :");
		kilo=input.nextDouble();
		System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
		boy=input.nextDouble();
		double kitle= (kilo/Math.pow(boy,2));
		System.out.println("Vucut Kitle Indeksiniz: "+kitle);
	}

}
