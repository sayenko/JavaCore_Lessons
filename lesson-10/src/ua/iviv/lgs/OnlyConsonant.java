package ua.iviv.lgs;

import java.util.Scanner;

public class OnlyConsonant {
	
	public void keepOnlyConsonant() {
		System.out.println("Enter the text");
		char wordMas[] = {'a', 'e', 'i', 'o', 'u', 'y', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�',
							'A', 'E', 'I', 'O', 'U', 'Y', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		for(char c : wordMas) {
			text = text.replace(c, '-');
		}
		
		System.out.println(text);
	}
	
}
