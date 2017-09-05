package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	public String searchName()
	{
		return "Linear Search: ";
	}
	
	
	public int search(int [] arr, int target)
	{
		//System.out.println("Slowing linear search down to see the calling");
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] == target)
			{
				return i; 
			}
		}
		
		return -1;
		
	}
	
}
