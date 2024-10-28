package Program.Java;

import java.util.Scanner;

public class PrimeNum {
	
	public static boolean isPrime(int num) {
		
		if(num<=1)
			return false;
		if(num%2==0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number num : ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("The number is a prime number");
		}
		
		else
			System.out.println("Not a prime number");
		
	}

}
