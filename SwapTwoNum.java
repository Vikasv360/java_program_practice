package Program.Java;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=15;
		
		System.out.println("The value of a & b before swapping : " + a + " : " + b);
		
		a=a+b; //25
		b=a-b; //10
		a=a-b; //15
		
		System.out.println("The value of a & b after swapping : " + a + " : " + b);
		
	}

}
