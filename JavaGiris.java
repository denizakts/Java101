package giris;

import java.util.Scanner;

public class JavaGiris {

	public static void main(String[] args) {
		
		System.out.println("Not hesaplama programına hosgeldiniz.."); //bas
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen Mat dersi notunuzu giriniz: "); //mat
		int Math = input.nextInt();
		System.out.println("Lutfen Fizik dersi notunuzu giriniz: "); //
		int Phys = input.nextInt();
		System.out.println("Lutfen Kimya dersi notunuzu giriniz: ");
		int Chemy= input.nextInt();
		System.out.println("Lutfen Turkce dersi notunuzu giriniz: ");
		int Turksh = input.nextInt();
		System.out.println("Lutfen Tarih dersi notunuzu giriniz: ");
		int History= input.nextInt();
		System.out.println("Lutfen Muzik dersi notunuzu giriniz: ");
		int Music = input.nextInt();	
		double ort = (Math+Phys+Chemy+Turksh+History+Music)/6;
		System.out.println(ort>=60? "Ort :" +ort+"Sinifi Gecti":"Ort :"+ort+ " Kaldi");
		
		
	}

}
