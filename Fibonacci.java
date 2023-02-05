package giris;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int n=0;
		int x=0,y=1;
		System.out.println(x+"\n" +y); // BASLANGIC DEGER REFERANSIM
		for(int i=0; i<15; i++)
		{
			n=x+y;
			x=y;
			y=n;
			System.out.println(n);			
		}
	}

}
