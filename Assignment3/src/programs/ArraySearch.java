package programs;

import java.util.*;

public class ArraySearch {
	int[] array = new int[6];
	Scanner sc = new Scanner(System.in);

	public void AssignArrayData() {
		System.out.println("Enter the array elements :");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

	}

	public int search(int num) {

		for (int j = 0; j < array.length; j++) {
			if (array[j] == num)
				return j;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySearch arraySearch = new ArraySearch();
		arraySearch.AssignArrayData();
		System.out.println("Enter the element to search :");
		int num = arraySearch.sc.nextInt();
		int index = arraySearch.search(num);
		if (index != -1)
			System.out.println("Element is found at index :" + index);
		else
			System.out.println("Element is not found");
	}

}
