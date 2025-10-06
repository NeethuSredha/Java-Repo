package assignment6SuperKeywordDemo;

class Addition {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}

public class Divisible extends Addition {

	public void checkDivisibility() {
		int tot = super.add(10, 20);
		if (tot % 10 == 0)
			System.out.println("The sum " + tot + " is divisible by 10.");
		else
			System.out.println("The sum " + tot + " is not divisible by 10.");
	}

	public static void main(String[] args) {
		Divisible d = new Divisible();
		d.checkDivisibility();
	}
}
