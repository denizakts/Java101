package giris;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userName, password;
		int right=3;
		int wallet=2000;
		int price;
		while(right>0)
		{
			
			System.out.println("Kullanici adinizi giriniz : ");
			userName=sc.nextLine();
			System.out.println("Sifrenizi giriniz : ");
			password=sc.nextLine();
			if(userName.equals("admin") && password.equals("12345")) 
			{
				
				System.out.println("Hosgeldiniz yapmak istediginiz islemi seciniz. \n 1-Para cek \n 2-Para yatir \n 3-Bakiye Sorgula");
				int select=sc.nextInt();
				switch(select)
				{
				case 1: System.out.println("Cekmek istediginiz miktari tuslayin.");
				price=sc.nextInt();
				if(price>wallet)
				{
					System.out.println("Yetersiz Bakiye");
				}
				else
				{
					System.out.println("Kalan Tutar : "+(wallet-price));
				} break;
				case 2: System.out.println("Yatirmak istediginiz tutari giriniz :");
				price=sc.nextInt();
				if(price<=0)
				{
					System.out.println("Hatali giris.");}else
					{System.out.println("Toplam bakiye : " +(price+wallet));} break;
				case 3: System.out.println("Toplam Bakiye : " +wallet); break;
				default: System.out.println("Gecersiz islem.");
				}
				
				break;
			}
			
			
			else
			{
				System.out.println("Hatali giris lutfen tekrar deneyiniz. ");
				right--;
				
				if(right==0)
				{
					
					System.out.println("Hesabiniz bloke olmustur.");
					break;
				}
			}
			
			
		}
		
		
		
		

	}

}
