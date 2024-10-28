package Program.Java;

import java.util.ArrayList;

public class SumOfEleArray {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> pairs =  new ArrayList<Integer>();
		
		int sumTarget=4;
		int[] arr= {1,2,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum = arr[i]+arr[j];
				
				if(sum==sumTarget) 
				{
					pairs.add(arr[i]);
					pairs.add(arr[j]);
				}
			}
		}
		
		for(int pair : pairs) {
			System.out.println("The element in an array which gives a sum equal to target values : " + pair);
		}
	}

}
