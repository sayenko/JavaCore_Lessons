package ua.iviv.lgs;

public class Main {

	public static void main(String[] args) {

		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome();
		
		OnlyConsonant oc = new OnlyConsonant();
		oc.keepOnlyConsonant();

		CountingInText words = new CountingInText();
		words.numberOfWords();
		words.mostCommonWord();
		
	}

}
