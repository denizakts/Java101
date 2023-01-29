package giris;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,islem;
		System.out.println("Lutfen ilk sayiyi giriniz :");
		a=input.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz :");
		b=input.nextInt();
		System.out.println("Toplama icin 1 \nCikarma icin 2\nCarpma icin 3\nBolme icin 4\n");
		islem=input.nextInt();
		switch(islem)
		{
		case 1: System.out.println(a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		case 4: if(b==0)
		{System.out.println("Gecersiz islem.");}
		else {System.out.println(a/b);}
		break;
		default:
			System.out.println("Uygun bir islem giriniz..");
		}
			
	}

}
