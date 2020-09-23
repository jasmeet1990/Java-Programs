package JavaCoding;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = scan.nextInt();
		int reverse = 0;
		int r;
		int temp;
		temp=n;
		while (n > 0) {

			 r = n % 10;
			reverse = (reverse * 10) + r;
			n = n / 10;
		}
		if (reverse == temp) {
			System.out.println("No is Palindrome");
		} 
		else {
			System.out.println("No is not Palindrome");
		}
	}

}
