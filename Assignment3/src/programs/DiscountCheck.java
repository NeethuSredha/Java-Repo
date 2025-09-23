package programs;

import java.util.*;

public class DiscountCheck {
	Scanner sc = new Scanner(System.in);
	static int itemCount;
	static double[] price = new double[5];
	static String[] item = new String[5];
	static double totalAmt = 0;
	static int flag = 0;

	// Get the prices of each items purchased.
	public void getItemAmount() {
		System.out.println("Enter the no:of items purchased:");
		itemCount = sc.nextInt();
		System.out.println("Enter the item name and price of each items purchased:");
		for (int i = 1; i <= itemCount; i++) {
			item[i] = sc.next();
			price[i] = sc.nextDouble();
		}
	}

	public void displayItemDetails(String[] item, double[] price) {
		for (int i = 1; i <= itemCount; i++) {
			System.out.println("Item " + i + ":" + item[i] + "  price:" + price[i]);
		}
	}

	// Calculation of the total amount.
	public static double totalAmount() {
		for (int i = 1; i <= itemCount; i++) {
			totalAmt = price[i] + totalAmt;
		}
		return totalAmt;
	}

	// Discount calculation.
	public static double discount(double amt) {
		if (amt > 5000) {
			amt = (amt - (amt * 20) / 100);
			flag = 1;
			return amt;
		} else
			return amt;
	}

	public static void main(String[] args) {
		DiscountCheck discountCheck = new DiscountCheck();
		discountCheck.getItemAmount();
		discountCheck.displayItemDetails(item, price);
		double total = totalAmount();
		System.out.println("The Total Bill amount is :" + total);
		double finalAmt = discount(total);
		if (flag == 1) {
			System.out.println("The final amount after discount is :" + finalAmt);
		} else
			System.out.println("No discount. The final amount is :" + finalAmt);
	}

}
