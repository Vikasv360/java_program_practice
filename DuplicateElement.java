package Program.Java;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"java","kotlin","python","java","ruby"};
		
		for(int i=0;i<names.length;i++) 
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i]==names[j]) 
				{
					System.out.println("The duplicate values in the given array is : " + names[i]);
				}
			}
		}
	}

}
