package giris;

import java.util.Scanner;

public class Calculator2 {

	static int sum(int a, int b)
	{
		int result=a+b;
		System.out.println("Sonuc :" +result);
		return result;
	}
	static int cikar(int a,int b)
	{
		int result = a-b;
		System.out.println("Sonuc : "+result);
		return result;
	}
	static int carp(int a,int b)
	{
		int result= a*b;
		System.out.println("Sonuc : "+result);
		return result;
	}
	static double bol(double a,double b)
	{
		if(b==0)
		{
			System.out.println("Tanımsız.");
		}
		double result=a/b;
		System.out.println("Sonuc :"+result);
		return result;
	}
	static double usAl(double a,double b)
	{
		double result= Math.pow(a, b);
		System.out.println("Sonuc : " +result);
		return result;
	}
	static int modAl(int a, int b)
	{
		int result= a%b;
		System.out.println("Sonuc : "+result);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select;
		String menu = "1-Toplama İslemi\n"
				+"2-Cikarma İslemi\n"
				+"3-Carpma İslemi\n"
				+"4-Bolme İslemi\n"
				+"5-Uslu Sayi Hesap\n"
				+"6-Mod Alma\n"
				+"7-Cikis Yap";
		while(true)
		{
			
		System.out.println(menu);
		System.out.println("Bir islem seciniz :");
		select = sc.nextInt();
		if(select==0 || select>7)
		{
			System.out.println("Gecersiz islem");
			break;
			
		}else if (select==7)
		{
			System.out.println("Program kapaniyor..");
			break;
		}
		System.out.println("First Num :");
		int a= sc.nextInt();
		System.out.println("Second Num :");
		int b= sc.nextInt();
		switch(select)
		{
		case 1:
			sum(a,b);
			break;
		case 2:
			cikar(a,b);
			break;
		case 3:
			carp(a,b);
			break;
		case 4:
			bol(a,b);
			break;
		case 5:
			usAl(a,b);
			break;
		case 6:
			modAl(a,b);
			break;
			
		}
		}
		
	}

}
