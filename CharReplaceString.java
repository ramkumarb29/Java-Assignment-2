package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CharReplaceString {
	
	public String searchReplace(char element, char replace) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String str=input.nextLine();
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
               ch[i]=replace;
            }
            else
                ch[i]=str.charAt(i);
        }
        return Arrays.toString(ch);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CharReplaceString crs=new CharReplaceString();
    System.out.println(crs.searchReplace('e','r'));
	}

}
