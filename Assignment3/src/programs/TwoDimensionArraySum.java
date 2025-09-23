package programs;

public class TwoDimensionArraySum {
	int[][] array1 = { { 2, 3, 4 }, { 2, 1 ,4} };
	int[][] array2 = { { 4, 9, 2 }, { 1, 1 ,7} };
	int[][] sum = new int[2][3];
	int i,j;
	

	//to display the array
	public void display(int[][] a) {
		for (i = 0; i < 2; i++) {
			for ( j = 0; j <3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public void add(int[][] a, int[][] b) {
		for (i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
			}
		}

		for (i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print(sum[i][j] + "\t");
		}
		
		System.out.println();
	}
		
	}

	public static void main(String[] args) {
		TwoDimensionArraySum s = new TwoDimensionArraySum();
		System.out.println(s.array1.length);
		s.display(s.array1);
		s.display(s.array2);
		s.add(s.array1, s.array2);

	}

}
