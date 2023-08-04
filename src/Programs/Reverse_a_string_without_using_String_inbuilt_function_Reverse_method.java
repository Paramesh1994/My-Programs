package Programs;


import java.util.Scanner;

public class Reverse_a_string_without_using_String_inbuilt_function_Reverse_method {

	public static void main(String[] args) {
		String str1="Paramesh";
		char chars[] =str1.toCharArray();
		for (int i = chars.length-1; i>=0; i--) {
			
			System.out.println(chars[i]);
		
		}
		
		// reverse by using the scanner method
		
		String str;
		Scanner scr =new Scanner(System.in);
		System.out.println("enter the sting");
		str=scr.nextLine();
		String[] token =str.split("");
		for (int i = token.length-1; i >=0; i--) {
			
			System.out.println(token[i]);
			
		}

	}

}
