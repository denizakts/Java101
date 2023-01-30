package giris;

import java.util.Scanner;

public class Cnr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k,r,t0=1,t1=1,t2=1;
		System.out.println("Kume eleman sayisi :");
		k=scan.nextInt();
		System.out.println("Gruplama sayisi C(k,r): ");
		r=scan.nextInt();
		for(int i=1; i<=k; i++)
		{
			t0= t0*i;	
		}
		for(int j=1; j<=r; j++)
		{
			t1=t1*j;
		}
		for (int l=1; l<=(k-r); l++)
		{
			t2=t2*l;	
		}
		System.out.println("C(n,r) : " +t0/(t1*t2));	
	}
}