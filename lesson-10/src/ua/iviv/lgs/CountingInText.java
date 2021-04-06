package ua.iviv.lgs;

import java.util.Scanner;

public class CountingInText {
	
	public void numberOfWords() {
		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.replaceAll("[\\p{Punct}\\s]+", " "); //Regex
		String textMas[] = text.split(" ");
		
		int i = 0;
		for(String s : textMas) {
			
			//the word has 3 or more letters
			if(s.length() > 2) {
				i++;
			}
		}
		System.out.println("The number of words in a text is: " + i);
	}
	
	public void mostCommonWord() {
		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.replaceAll("[\\p{Punct}\\s]+", " ");
		String textMas[] = text.split(" ");
		
		int i = 0;		
		for(String s : textMas) {			
			//the word has 3 or more letters
			if(s.length() > 2) {
				i++;
			}
		}
		
		String wordMas[] = new String[i];
		i = 0;
		for(String s : textMas) {
			//the word has 3 or more letters
			if(s.length() > 2) {
				wordMas[i] = s;
				i++;
			}
		}
		
		int maxValue = 0;		
		String maxWord = null;
		
		for(int j = 0; j < wordMas.length; j++) {
			int counter = 0;
			for(int k = 0; k < wordMas.length; k++) {
				if(wordMas[j].equalsIgnoreCase(wordMas[k])) {
					counter++;
				}
			}
			if(counter>maxValue) {
				maxValue = counter;
				maxWord = wordMas[j];
			}
		}
		System.out.println("The word \"" + maxWord + "\" occurs " + maxValue + " times");
	}
}
