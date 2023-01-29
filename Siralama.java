package giris;

import java.util.Scanner;

public class Siralama {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("ilk sayi degeri: ");
		a=input.nextInt();
		System.out.println("ikinci sayi degeri: ");
		b=input.nextInt();
		System.out.println("Ucuncu sayi degeri: ");
		c=input.nextInt();
		if(a>b && b>c)
		{
			System.out.println("a>b>c");
			
		}else if (a>c && c>b)
		{
			System.out.println("a>c>b");
		}else if (a<b && b<c)
		{	System.out.println("c>b>a");}
		else if (c>a && a>b)
		{
			System.out.println("c>a>b");
		}else if (b>c && c>a)
		{System.out.println("b>c>a");}
		else if (b>c && c<a)
		{
			System.out.println("b>a>c");
		}
	}

}
