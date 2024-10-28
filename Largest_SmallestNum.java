package Program.Java;

public class Largest_SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {123,34,56,789,-89,-12,-903};
		
		int largest_Num = arr[0];
		int smallest_Num =arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest_Num < arr[i])
			{
				largest_Num =arr[i];
				
			}
			else if( smallest_Num >arr[i]) 
			{
				smallest_Num =arr[i];
			}
		}
		
		System.out.println("The largest number in given array is : " + largest_Num );
		System.out.println("The smallest number in given array is : " + smallest_Num );
	}

}
