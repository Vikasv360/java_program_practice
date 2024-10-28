package Program.Java;

public class JunkRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "#$%^&AYGHB456789AHGBN$%^";
				
				str =str.replaceAll("[^A-Za-z0-9]", "");
				
				System.out.println(str);
	}

}
