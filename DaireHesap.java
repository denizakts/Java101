package giris;

import java.util.Scanner;

public class DaireHesap {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double pi,r,a,alan,cevre,dalan;
		pi=3.14;
		System.out.println("Lutfen yaricap degeri giriniz: ");
		r=input.nextDouble();
		alan=Math.pow(r,2)*pi;
		cevre=2*pi*r;
		System.out.println("Aci olcusu giriniz: ");
		a=input.nextDouble();
		dalan= (Math.pow(r,2)*pi*a)/360;
		System.out.println("Cevre "+cevre+"\nAlan " +alan+" \nDilim Alan " +dalan);
	}

}
