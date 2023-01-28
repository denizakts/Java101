package giris;

import java.util.Scanner;

public class KdvHesap {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int urun;
		System.out.println("Urun tutarini giriniz :");
		urun = input.nextInt();
		if (urun>0 && urun<1000)
		{
			System.out.println(urun+(urun*0.18));
		}else if(urun<=0) {
			System.out.println("Yanlis girilen urun tutari.");
		}else
			System.out.println(urun+(urun*0.08));

	}

}
