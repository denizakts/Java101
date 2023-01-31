package giris;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bir sayi giriniz :");
		int sayi,total=0;
		sayi=sc.nextInt();
		while(sayi!=0) //sayimiz 0' a esit olmadigi sürece donecek
		{
			total=(sayi%10)+total; //her modul 10nda sayimizi saklayacagiz
			sayi/=10; // yeni sayimiz sayi/10 olacak
			
		}System.out.println(total);
		
		
		
	}	

}
