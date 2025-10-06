package assignment3;
import java.util.*;

//4!=4*3*2*1

public class FactorialNum {
	Scanner sc=new Scanner(System.in);
	public void factorial() {
		System.out.println("Enter the number");
		int num=sc.nextInt(); //4
		
		int fact=1;
		for(int i=num;i>0;i--) {
		fact=fact*i;
	}
		System.out.println("The factorial of the number "+num+ " is :"+fact);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNum f=new FactorialNum();
		f.factorial();
	}

}
