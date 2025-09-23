package programs;

import java.util.*;

public class Factorial {
	static int number, fact = 1;

	public static int getFactorial() {
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if (number != 0) {
			for (int i = number; i > 0; i--) {
				fact = fact * i;
			}
			return fact;
		} else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		System.out.println("Enter a number :");
		int fact = getFactorial();
		System.out.println("Factorial of the number " + number + " is " + fact);
		;
	}

}
