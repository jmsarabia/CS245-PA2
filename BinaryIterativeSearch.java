package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	public String searchName()
	{
		return "Binary_Iterative_Search";
	}
	
	
	public int search(int [] arr, int target)
	{
		//System.out.println("Slowing Bin Iterative down to see calling");
		int min = 0;
		int max = arr.length-1;
		int mid;
		while(min <= max) 
		{
			mid = (min + max) /2;
			if(arr[mid] == target)
			{
				System.out.println("MID/TARGET IS AT: "+mid);
				return mid;
			}
			if(arr[mid] < target)
			{
				min = mid+1;
			}
			else
			{
				max = mid - 1;
			}
		}
		return -1;
		
	}

}
