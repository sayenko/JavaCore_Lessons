package ua.iviv.lgs;

import java.util.Scanner;

public class Palindrome {
		
	public void isPalindrome() {
		System.out.println("Enter a word of 5 letters: ");
		Scanner sc = new Scanner(System.in);
		String stringWord = sc.nextLine();
		String reversWord = new StringBuilder(stringWord).reverse().toString();

		if(stringWord.length()!=5) {
			System.err.println("The number of letters is not equal to 5");
		} else if(stringWord.equalsIgnoreCase(reversWord)) {
			System.out.println("The word " + stringWord + " is a palindrome");
		} else {
			System.out.println("The word " + stringWord + " is not a palindrome");
		}
	}
	
}
