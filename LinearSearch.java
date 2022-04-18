package practice;

import java.util.Scanner;

public class LinearSearch {
	
	 public int linearSearch(char element) {
		 Scanner input=new Scanner(System.in);
			System.out.println("Enter a string:");
	        String str=input.nextLine();
	for (int i = 0; i < str.length(); i++)
	    {
        if (str.charAt(i) == element) 
        {
            return i;
        }
    }
    return -1;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch ls=new LinearSearch();
        
        if(ls.linearSearch('r')>-1)
            System.out.println("The character found at index -- " +ls.linearSearch('r'));
        else
            System.out.println("Character Not Found");

	}

}
