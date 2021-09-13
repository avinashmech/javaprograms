package starting;
import java.util.Scanner;
//reverse the given string
public class ReverseString {
		public static void main(String[] args) {
			String original;    //for storing user input
			String rev = "";     //for storing of string
			
			                      //taking input from user
			System.out.println("Enter String to Reverse");
			Scanner sc = new Scanner(System.in);
			
			original = sc.nextLine();
		int len = original.length();
		
		for(int i= len-1;i>=0;i--)
			rev = rev+original.charAt(i);
		
		//lets print  the string objects
		System.out.println("Reverse of string is;" + rev);
		}
	}
