package assignment4;

import java.util.*;

public class ReverseNumber {

	static Scanner sc = new Scanner(System.in);
	static int number;
	int reverse = 0;

	public ReverseNumber() {
		this(number);
		System.out.println("The reverse of the number " + number + " is :" + reverse);
	}

	public ReverseNumber(int number) {
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to find the reverse:");
		number = sc.nextInt();
		sc.close();
		ReverseNumber reverseNumber = new ReverseNumber();

	}

}
