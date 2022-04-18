package practice;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string:");
        String str=input.nextLine();
        String revStr=new String();
        
        for(int i=str.length()-1;i>=0;i--)
        {
        	revStr=revStr+str.charAt(i);
        }
        System.out.println("Given String:"+str);
        System.out.println("Reversed String:"+revStr);
	}

}
