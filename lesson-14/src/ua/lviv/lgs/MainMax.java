package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMax {

	public static void main(String[] args) {
		MainMax mainMax = new MainMax();
		Commodity commodity = new Commodity();
		while (true) {
			System.out.println("Оберіть пункт меню:");
			System.out.println("1. Додати товар");
			System.out.println("2. Видалити товар");
			System.out.println("3. Замінити товар");
			System.out.println("4. Сортувати за назвою");
			System.out.println("5. Сортувати за довжиною");
			System.out.println("6. Сортувати за шириною");
			System.out.println("7. Сортувати за вагою");
			System.out.println("8. Виводимо і-тий елемент колекції");
			System.out.println("9. Вийти з програми");
			try {
				mainMax.menu(commodity);
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void menu(Commodity commodity) {		
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextLine()) {
		case "1":
			commodity.add();
			break;
		case "2":
			commodity.remove();
			break;
		case "3":
			commodity.set();
			break;
		case "4":
			commodity.sortByName();
			break;
		case "5":
			commodity.sortByLength();
			break;
		case "6":
			commodity.sortByWidth();
			break;
		case "7":
			commodity.sortByWeight();
			break;
		case "8":
			commodity.get();
			break;
		case "9":
			commodity.exit();
			break;
		}
	}
}