package Program.Java;

import java.util.Scanner;

public class ArmStrongNum {

	public static void isArm(int num) {
		int cube=0;
		int r=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(t==cube) {
			System.out.println("The given number is an armstrong number");
		}
		else
			System.out.println("The given number is not an armstrong number");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		isArm(num);
		
	}

}
