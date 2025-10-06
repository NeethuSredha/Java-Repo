package assignment3;

import java.util.*;

public class MatrixAddition {
	Scanner sc = new Scanner(System.in);
	int[][] array1 = new int[3][2];
	int[][] array2 = new int[3][2];
	int[][] sum = new int[3][2];

	public void assignData() {
		System.out.println("Enter the elements for first array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				array1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the elements for second array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
	}

	public void sum() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
			}
		}

	}

	public void displayData(int[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatrixAddition matrixAdd = new MatrixAddition();
		matrixAdd.assignData();
		matrixAdd.sum();
		System.out.println("First matrix :");
		matrixAdd.displayData(matrixAdd.array1);
		System.out.println("Second matrix :");
		matrixAdd.displayData(matrixAdd.array2);
		System.out.println("Matrix addition result :");
		matrixAdd.displayData(matrixAdd.sum);
	}

}
