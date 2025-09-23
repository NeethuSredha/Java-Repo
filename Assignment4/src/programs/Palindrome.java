package programs;

public class Palindrome {

	public boolean checkForPalindrome(String str) {

		str = str.toLowerCase();
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();

		boolean result1 = palindrome.checkForPalindrome("Java");
		if (!result1)
			System.out.println("The string Java is not a palindrome.");
		else
			System.out.println("The string Java is a palindrome.");

		boolean result2 = palindrome.checkForPalindrome("Malayalam");
		if (!result2)
			System.out.println("The string Malayalam is not a palindrome.");
		else
			System.out.println("The string Malayalam is a palindrome.");

	}

}
