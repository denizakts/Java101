package giris;

import java.util.Scanner;





public class Login {

	public static void main(String[] args) {
		
		String userName,password,pass2,c;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Kullanici Adiniz :"); // step0
		userName=obj.nextLine();				
		System.out.println("Sifreniz :");
		password=obj.nextLine();
		if(userName.equals("admin")&& password.equals("12345"))
		{
			System.out.println("Giris sayfasina yonlendiriliyorsunuz..");
		}else
		{
			System.out.println("Hatali kullanici adi ya da parola!!! Sifrenizi degistirmek ister misiniz? E/H ");
			c=obj.nextLine();
			if(c.equals("e") || c.equals("E"))
			{
				System.out.println("Lutfen yeni sifrenizi giriniz..");
				pass2=obj.nextLine();
				if(pass2.equals("12345") || pass2.equals(""))
				{
					System.out.println("Parola olusturulamadi");
				}else {System.out.println("Parola degistirildi.");}
			}else System.out.println("Giris sayfasina yonlendiriliyorsunuz..");
		}
		
		
		
		
		
		
	}

}
