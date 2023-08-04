package Programs;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter swapping numbers");
		Scanner scr=new Scanner(System.in);
		x=scr.nextInt();
		y=scr.nextInt();
		System.out.println("Before swapping \n"+x+y);   // \n is a regex its give new line
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping \n"+x+y);

	}

}
