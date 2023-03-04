package giris;

import java.util.Scanner;

public class Poww {

	
	
	static double pow()
	{
		
	{
		double a,b;
		Scanner sc= new Scanner(System.in);
		double result = 1;
		System.out.println("Kuvveti alinacak sayiyi giriniz :");
		a=sc.nextDouble();
		System.out.println("Us");
		b=sc.nextDouble();
		for(int i=1; i<=b; i++)
		{
			result*=a;
		}
		
		System.out.println(result);
		return result + pow();}
	
	}
	public static void main(String[] args) {
		pow();

	}

}
