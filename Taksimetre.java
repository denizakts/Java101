package giris;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double km,tutar;
		System.out.println("Gidilen mesafeyi giriniz :");
		km=input.nextDouble();
		km*=2.20;
		tutar=10+km;
		if(tutar<20)
		{
			System.out.println("Toplam tutar : 20 TL'dir" );
		}else
			System.out.println("Toplam tutar :" +tutar);
		
		

	}

}
