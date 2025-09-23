package programs;

public class NumberReverse {

	public static void main(String[] args) {
		int number=234;
		int remainder,reverse=0;
		while(number!=0) {
			remainder=number%10;   //4  3 2
			reverse=reverse*10+remainder;  //4(0*10+4)  43(4*10+3) 432(43*10+2)
			number=number/10;  //23 2 0
		}
System.out.println("The reversed number is :"+reverse);
	}

}
