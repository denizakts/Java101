package giris;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double mat,phy,turk,chem,music,average; // Gecme notu 55 olarak hesaplanacak
		Scanner in = new Scanner(System.in);
		System.out.println("Matematik dersi icin not giriniz :");
		mat=in.nextDouble();
		System.out.println("Fizik dersi icin not giriniz :");
		phy=in.nextDouble();
		System.out.println("Kimya dersi icin not giriniz :");
		chem=in.nextDouble();
		System.out.println("Muzik dersi icin not giriniz :");
		music=in.nextDouble();
		System.out.println("Turkce dersi icin not degeri :");
		turk=in.nextDouble();
		if(mat<0 || mat>100 || phy<0 || phy>100 || chem<0 || chem>100 || music<0 || music>100 || turk<0 || turk>100)
		{
			System.out.println("Gecersiz not araligi girildi.");
		}
		else
		{
			average=(mat+phy+chem+music+turk)/5;
			System.out.println("Ortalama :" +average);
			if(average>=55)
			{
				System.out.println("Sinifi gectiniz.. ");
			}else System.out.println("Donem tekrari..");
		}
		
	}

}
