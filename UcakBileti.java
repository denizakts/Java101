package giris;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		
		double mesafe,tip,yas,tutar=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Gidilecek toplam mesafeyi girin: ");
		mesafe=input.nextDouble();
		mesafe=mesafe*0.10; //gidilen mesafe sonucu cikan tutar
		System.out.println("Yasinizi giriniz :");
		yas=input.nextDouble();
		System.out.println("Yolculuk tipini giriniz 1- Tek Yon , 2- Gidis-Donus ");
		tip=input.nextDouble();
		if(yas>0 && yas<12 && tip==1)
		{
			tutar+=(mesafe/2); //yas araliginde %50 indirim
			System.out.println("Tutar :" +tutar);
		}else if(yas>0 && yas<12 && tip==2)
		{
			mesafe=(mesafe)/2; //yas araliginda %50 indirim
			tutar=(mesafe-(mesafe*0.20)); // yeni cikan tutar-gidis donus tutari
			System.out.println("Tutar :" +tutar);
		}else if (yas>=12 && yas<24 && tip==1)
		{
			tutar=(mesafe-mesafe*0.10);
			System.out.println(tutar);
		}else if (yas>=12 && yas<24 && tip==2)
		{
			mesafe=(mesafe-mesafe*0.10);
			tutar=(mesafe-mesafe*0.20); // yeni tutar=tutar-gidis donus tutari
			System.out.println(tutar);

		}else if (yas>65 && tip==1)
		{
			tutar=(mesafe-mesafe*0.30);
			System.out.println(tutar);
		}else if(yas>65 && tip==2)
		{
			mesafe= (mesafe-mesafe*0.30);
			tutar=(mesafe-mesafe*0.20);
			System.out.println(tutar);
			
		} else if(yas<0 && tip>2 && tip<0)
		{
			System.out.println("Veriler hatali.");
		}
		// 24 ve <=65 yas arasi icin kodlama yapilmadi 65 yas sonrasi icin sinir yok pratik amacli yazilmistir.
		

	}

}
