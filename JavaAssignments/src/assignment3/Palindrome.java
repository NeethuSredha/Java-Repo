package assignment3;

import java.util.*;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);
	static int originalNumber;

	public int reverseNumber(int num) {
		int remainder, reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}

	public void checkForPalindrome(int reverse) {
		if (originalNumber == reverse)
			System.out.println("The number " + originalNumber + " is a palindrome.");
		else
			System.out.println("The number " + originalNumber + " is not a palindrome.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		originalNumber = number;
		int reversedNumber = palindrome.reverseNumber(number);
		palindrome.checkForPalindrome(reversedNumber);
	}

}
