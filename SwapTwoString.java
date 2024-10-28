package Program.Java;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="Hello";
		String b="World";
		
		System.out.println("The value of a and b strings before swap : " + a + " : " + b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("The value of a and b strings after swap : " + a + " : " + b);
	}

}
