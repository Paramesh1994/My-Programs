package Programs;

import java.util.Scanner;

public class Swap_two_numbers_using_the_third_variable {

	public static void main(String[] args) {
		
		int x,y,temp;
		System.out.println("Enter swapping numbers");
		Scanner scr=new Scanner(System.in);
		x=scr.nextInt();
		y=scr.nextInt();
		System.out.println("before swapping \n"+x + y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping \n"+ x + y);
		
		// for string swapping
		
		String str1,str2,Swapping;
		System.out.println("Enter swapping string");
		Scanner Strscr=new Scanner(System.in);
		str1=Strscr.next();
		str2=Strscr.next();
		System.out.println("before swapping \n"+str1 +"\n"+ str2);      // \n is a regex its give new line
		Swapping=str1;
		str1=str2;
		str2=Swapping;
		System.out.println("After swapping \n"+ str1+"\n"+ str2);
	}

}
