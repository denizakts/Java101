package giris;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yil;
		System.out.println("Yil giriniz :");
		yil=input.nextInt();
		if((yil%4==0 && yil%100!=0) || yil%400==0)
		{System.out.println("Artik yil");}
		else
		{System.out.println("Artik yil degil");}
}}
