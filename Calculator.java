package giris;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sayi,toplam=0,average=0;
		System.out.println("Bir sayi belirtiniz :");
		sayi=input.nextInt();
		for(int i=12; i<=sayi; i++) //Sayilar 3 ve 4'ün katı olduğu için dongum 12 den başliyor.
		{
			if(i%12==0) 
			{
			average++;//her bölen kati ortalama hesaplamak için sayiyorum
			toplam+=i;//girilen sayiya kadar 12'nin katlarini topluyorum.
			}		
		}
		System.out.println(toplam/average); // ortalama	
	}
}
