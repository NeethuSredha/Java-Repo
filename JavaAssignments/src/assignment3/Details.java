package assignment3;

import java.util.*;

public class Details {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int age;

	public static void setDetails() {
		System.out.println("Enter your name and age :");
		name = sc.next();
		age = sc.nextInt();
	}

	public static void getDetails() {
		System.out.println("Name is :" + name);
		System.out.println("Age is :" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details details = new Details();
		setDetails();
		getDetails();

	}

}
