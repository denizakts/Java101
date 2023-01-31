package giris;

import java.util.Scanner;

public class LoopPow {

	public static void main(String[] args) {
		int n,x,total=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ussu alinacak sayi : " );
		n=sc.nextInt();
		System.out.println("Us : ");
		x=sc.nextInt();
		for(int i=1; i<=x; i++) // Dongumu kuvvet kadar donduruyorum
		{
			total*= n; // Carpimim kuvvet dongusu kadar. // math.pow kullanilarak da yapilabilir fakat ödev for olarak istenmis.
		}
System.out.println("Sonuc : "+total);
	}
}
