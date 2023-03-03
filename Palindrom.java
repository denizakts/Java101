package giris;

public class Palindrom {

	
	static boolean isPalindrom(int number)
	{
		
		int temp = number, reverseNumber =0,lastNumber;
		
		while(temp!=0)
		{
		//System.out.println("Num " +temp);
		lastNumber = temp %10;
		//System.out.println("Son : " +lastNumber);
		reverseNumber = (reverseNumber*10) +lastNumber;
		//System.out.println("Yeni " +reverseNumber);
		temp/=10;
		
		}
		if(number == reverseNumber)
		return true;
		else 
			return false;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrom(10));

	}

}
