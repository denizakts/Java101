package giris;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);;
		int toplam=0;
		int sayi;
		int i=1;
		do {
			System.out.println("Bir sayi giriniz :");
			sayi=sc.nextInt();
			for(int n=1; n<sayi; n++)
			{
				if(sayi%n==0)
				{
					toplam+=n;	
				}
			}//for
			
				
			i++;
			if(toplam==sayi && toplam!=0 )
			{
				System.out.println("Mukemmel Sayi");
			}else if(toplam!=sayi)
			{
				System.out.println("Mukemmel Sayi Degil.");
			}
			toplam=0;
		}while(sayi>0);
		
		}
	}


