package main.java;

public class Largest {

	public int find(int[] arr) throws Exception {
		// TODO Auto-generated method stub
		//return 9;
		if(arr.length<=0)
			throw new Exception("Array is empty");
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++)
		{
			if(max<arr[i])
				max = arr[i];
		}
		return max;
	}

}