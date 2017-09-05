package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName()
	{
		return "Binary Recursive Search: ";
	}
	
	
	public int search(int [] arr, int target)
	{
		return binRecSearch(arr, target, 0, arr.length-1);
	}
	
	protected int binRecSearch(int[] arr, int target, int min, int max) 
	{
		//System.out.println("Slowing Bin Recursive down to see calling");
		if(min > max)
		{
			return -1;
		}
		int mid = (min + max) / 2; 
		if (arr[mid] == target)
			return mid;
		//Reduce search to first partition
		if(arr[mid] < target)
		{
			return binRecSearch(arr, target, min, mid-1);
		}
		//Reduce search to second half
		else
			return binRecSearch(arr, target, mid+1, max);
		
	}

}
