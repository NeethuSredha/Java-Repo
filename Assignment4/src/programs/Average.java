package programs;

public class Average {
	int num1, num2, num3;
	float num4, num5, num6;

	public int averageCalculation(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}

	public float averageCalculation(float num4, float num5, float num6) {
		return (num4 + num5 + num6) / 3;
	}

	public static void main(String[] args) {
		Average average1 = new Average();
		int averageInt = average1.averageCalculation(40, 50, 80);
		System.out.println("Average of the three integer numbers is " + averageInt + "\n");
		Average average2 = new Average();
		float averageFloat = average2.averageCalculation(20.5f, 50.5f, 30.8f);
		System.out.println("Average of the three float numbers is " + averageFloat);
	}

}
