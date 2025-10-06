package assignment3;

import java.util.*;

public class EligibilityCheck {
	static Scanner sc = new Scanner(System.in);

	public static boolean AgeCheck() {
		System.out.println("Enter the age of the candidate :");
		int age = sc.nextInt();
		if (age >= 18)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EligibilityCheck check = new EligibilityCheck();
		boolean val = AgeCheck();
		if (val)
			System.out.println("The candidate is eligible for voting.");
		else
			System.out.println("The candidate is not eligible for voting.");
	}

}
