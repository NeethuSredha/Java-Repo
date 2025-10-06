package assignment5Inheritance;

import java.util.*;

class BasicPay {
	Scanner sc = new Scanner(System.in);
	double basic;
	double deduction;
	double bonus, hra, pf, total;

	public void getBasicPay() {
		System.out.println("Enter the employee's basic pay, deduction and bonus :");
		basic = sc.nextDouble();
		deduction = sc.nextDouble();
		bonus = sc.nextDouble();
	}
}

class Hra extends BasicPay {
	public void hraPfCal() {
		// super.getBasicPay();
		hra = 0.05 * basic;
		pf = 0.20 * basic;
	}
}

public class TotalSalary extends Hra {

	public void totalSal() {
		// super.hraPfCal();
		total = basic + hra - pf - deduction + bonus;
	}

	public static void main(String[] args) {
		TotalSalary tot = new TotalSalary();
		tot.getBasicPay();
		tot.hraPfCal();
		tot.totalSal();
		System.out.println("\n----SALARY DETAILS----\n");
		System.out.println("BASIC PAY :" + tot.basic + "\n" + "DEDUCTION :" + tot.deduction + "\n" + "HRA :" + tot.hra
				+ "\n" + "PF :" + tot.pf + "\n" + "BONUS :" + tot.bonus + "\n" + "TOTAL SALARY BY HAND:" + tot.total
				+ "\n");
	}

}
