package giris;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		
		double armut,elma,domates,muz,patlican;
		Scanner input = new Scanner(System.in);
		System.out.println("Armut icin kg giriniz: ");
		armut = input.nextDouble();
		armut= armut*2.14;
		System.out.println("Elma icin kg giriniz: ");
		elma=input.nextDouble();
		elma=elma*3.67;
		System.out.println("Domates icin kg giriniz: " );
		domates=input.nextDouble();
		domates=domates*1.11;
		System.out.println("Muz icin kg giriniz : ");
		muz=input.nextDouble();
		muz=muz*0.95;
		System.out.println("Patlican icin kg giriniz: ");
		patlican=input.nextDouble();
		patlican=patlican*5.00;
		double toplam = armut+elma+patlican+domates+muz;
		System.out.println("Toplam tutar " +toplam);
	}

}
