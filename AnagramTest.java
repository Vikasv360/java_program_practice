package Program.Java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string value : ");	
		String name1 = sc.next();
		
		System.out.println("Enter the second string value : ");
		String name2 = sc.next();

//	 String name1="Silent";
//	 String name2="Listen";
//	 
	 String modName1= name1.toLowerCase();
	 String modName2= name2.toLowerCase();
	 
	 char[] ch1 =  modName1.toCharArray();
	 char[] ch2 = modName2.toCharArray();
	 
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 
	 if(Arrays.equals(ch1, ch2)) {
		 System.out.println("The given string is an anagram");
	 }
	 else
		 System.out.println("Not an anagram");
	 
	}

}
