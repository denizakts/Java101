package giris;

import java.util.Scanner;

public class Zodiak {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int month,day;
		System.out.println("Ay bilgisi giriniz :");
		month=input.nextInt();
		System.out.println("Gun bilgisi giriniz :");
		day = input.nextInt();
		if ( month==12 && day>21 || month==1 && day<=21)
		{
			System.out.println("Oğlak burcu");
		}
		else if(month==1 && day>21 || month==2 && day<=19)
		{
			System.out.println("Kova burcu");
		}
		else if (month==2 && day>19 || month==3 && day<=20)
		{
			System.out.println("Balik burcu");
		}
		else if (month==3 && day>20 || month==4 && day<=20)
		{	System.out.println("Koc Burcu");}
		else if (month==4 && day>20 || month==5 && day<=21)
		{
			System.out.println("Boga burcu");
		}else if (month==5 && day>21 || month==6 && day<=22)
		{
			System.out.println("Ikizler burcu.");
		}
		else if (month==6 && day>22 || month==7 && day<=23)
		{
			System.out.println("Yengec burcu.");
		}
		else if (month==7 && day>23 || month==8 && day<=22)
		{
			System.out.println("Aslan burcu.");
		}
		else if (month==8 && day>22 || month==9 && day<=22)
		{
			System.out.println("Basak burcu");
		}
		else if (month==9 && day>22 || month==10 && day<=22)
		{
			System.out.println("Terazi burcu.");
		}else if (month==10 && day>22 || month==11 && day<=21)
		{
			System.out.println("Akrep burcu.");
		}else if (month==11 && day>21 || month==12 && day<=21)
		{
			System.out.println("Terazi burcu.");
		}
		
}
}

