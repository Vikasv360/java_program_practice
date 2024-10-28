package Program.Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the factorial value : ");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		
		System.out.println("The factorial value of the given number : " + num + " = " +fact);
	}

}
