package giris;

import java.util.Scanner;

public class CZodiak {

	public static void main(String[] args) {
		int birthdate;
		Scanner input = new Scanner(System.in);
		//dogum tarihini input olarak alacagiz.
		System.out.println("Dogum tarihini giriniz :");
		birthdate=input.nextInt();
		if (birthdate%12==0) {System.out.println("Maymun");	}
		else if(birthdate%12==1) {System.out.println("Horoz");}
		else if(birthdate%12==2) {System.out.println("Köpek");}
		else if(birthdate%12==3) {System.out.println("Domuz");}
		else if(birthdate%12==4) {System.out.println("Fare");}
		else if(birthdate%12==5) {System.out.println("Öküz");}
		else if(birthdate%12==6) {System.out.println("Kaplan");}
		else if(birthdate%12==7) {System.out.println("Tavşan");}
		else if(birthdate%12==8) {System.out.println("Ejderha");}
		else if(birthdate%12==9) {System.out.println("Yilan");}
		else if(birthdate%12==10) {System.out.println("At");}
		else if(birthdate%12==11) {System.out.println("Koyun");}
	}

}
