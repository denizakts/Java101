package giris;

import java.util.Scanner;

public class LoopsTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int toplam=0;
		
		do {
			System.out.println("Bir sayi giriniz :");
			n=sc.nextInt();
			
			if(n%2==1)
			{	
				System.out.println("Dongu bitti.");
				System.out.println("Toplam : "+toplam);
				break;
			}else if (n%4==0)
			{toplam+=n;}
			
		}
		while(n%2==0);
		
	}

}
