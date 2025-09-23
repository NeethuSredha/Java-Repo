package programs;

import java.util.*;

public class SumArray {
	Scanner sc = new Scanner(System.in);

	public void sumElements() {
		int sum = 0;
		int[] array = new int[6];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < array.length; j++) {
			sum = sum + array[j];
		}
		System.out.println("Sum of the elements of the array is :" + sum);
	}

	public static void main(String[] args) {
		SumArray sumArray = new SumArray();
		sumArray.sumElements();
	}
}
