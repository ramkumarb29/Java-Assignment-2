/*Create a class Stores with an ArrayList<Product> as its only field, 
initialize the list in the constructor of stores. 
Create a method in the Stores class that returns the sorted list.*/

package javaexercises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Stores {
	public Stores()
	{
	    List<String> li = new ArrayList<String>();
	    li.add("Eraser");
	      li.add("Pen");    
	      li.add("Pencil");    
	      li.add("NoteBook");    
	      Collections.sort(li);   
	      System.out.println(li);  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stores s = new Stores();
		    System.out.println(s);

	}

}
