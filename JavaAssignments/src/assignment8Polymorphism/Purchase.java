package assignment8Polymorphism;

import java.util.*;

class Offseason {
	public double discount(double price) {
		double discount = price * 0.15;
		System.out.println("The discount during offseason(15%) is :" + discount);
		return discount;
	}
}

class Onseason extends Offseason {
	public double discount(double price) {
		super.discount(price);
		double discount = price * 0.40;
		System.out.println("The discount during onseason(40%) is :" + discount);
		return discount;
	}
}

public class Purchase extends Onseason {
	public double purchaseAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount of the purchase :");
		double price = sc.nextDouble();
		sc.close();
		return price;

	}

	public static void main(String[] args) {
		Purchase purchase = new Purchase();
		double amount = purchase.purchaseAmount();
		purchase.discount(amount);
	}
}
