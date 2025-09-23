package programs;

import java.util.*;

public class FactorialNumber {
	static Scanner sc = new Scanner(System.in);
	int num, fact = 1;

	public FactorialNumber(int num) {
		this.num = num;
	}

	public int factorialCalculation() {
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		this.displayFactorial();
		return fact;

	}

	public void displayFactorial() {
		System.out.println("The factorial of the number is :" + fact);
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to find the factorial :");
		FactorialNumber factorial = new FactorialNumber(sc.nextInt());
		factorial.factorialCalculation();

	}

}
