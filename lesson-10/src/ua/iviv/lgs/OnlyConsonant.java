package ua.iviv.lgs;

import java.util.Scanner;

public class OnlyConsonant {
	
	public void keepOnlyConsonant() {
		System.out.println("Enter the text");
		char wordMas[] = {'a', 'e', 'i', 'o', 'u', 'y', 'à', 'å', 'è', '³', 'î', 'ó', 'ÿ', 'þ', 'º', '¿', '¸', 'û', 'ý',
							'A', 'E', 'I', 'O', 'U', 'Y', 'À', 'Å', 'È', '²', 'Î', 'Ó', 'ß', 'Þ', 'ª', '¯', '¨', 'Û', 'Ý'};
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		for(char c : wordMas) {
			text = text.replace(c, '-');
		}
		
		System.out.println(text);
	}
	
}
