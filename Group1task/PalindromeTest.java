package chapter4.exercise416;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a five digit number: ");
		digit = input.nextInt();
			while(digit < 10000 || digit > 100000 )
			{
				
				if (digit < 10000 || digit > 100000) {
				System.out.println("Error number must be five digits long");
				System.out.println("Try again: ");
				digit = input.nextInt();
				}
			}
			
			input.close();
		Palindrome user = new Palindrome();
		user.setNumber(digit);
		checkPalindrome(user);
	}
	public static void checkPalindrome(Palindrome object)
	{
		System.out.print(object.reverseNumber() ? "is Palindrome" : "is not Palindrome");
	}

}