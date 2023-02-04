package giris;

import java.util.Scanner;

public class MinMax2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int sayi;
        int min=0,max=0;
        System.out.println("Sayi adedi giriniz :");
        sayi=sc.nextInt();
      for(int i=1; i<=sayi; i++)
      {
    	  System.out.println(i+".sayi giriniz :");
    	  no=sc.nextInt();
    	  if(i==1)
    	  {
    		 min=no;
    		 max=no;
    	  }
    	  else
    	  {
    		  if(no>max)
    			  max=no;
    		  else if (no<min)
    		  {
    			  min=no;
    		  }
    	  }
      } System.out.println("max :" +max+" min :"+min);
      
    }


	}


