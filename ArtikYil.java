package giris;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yil;
		System.out.println("Yil giriniz :");
		yil=input.nextInt();
		int k=400;
		if(yil%k==0 && yil%4==0)
		{	System.out.println("Artik yil");}
		else if(yil%100==0 && yil%k!=0)
		{
			System.out.println("Artik yil degil.");
		}
		else if (yil%100!=0 && yil%4==0)
		{
			System.out.println("Artik yil");
		}
}}
