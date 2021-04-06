package ua.lviv.lgs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainModifiedTask14 {

	public static void main(String[] args) {

		minModifiedTask14();

		maxModifiedTask14();
	}
	
	public static void minModifiedTask14() {
		Set<Employee> setEmployee = new HashSet<Employee>();
		
		setEmployee.add(new Employee("Ivan", 21));
		setEmployee.add(new Employee("Maria", 18));
		setEmployee.add(new Employee("Yura", 36));
		setEmployee.add(new Employee("Olena", 24));
		setEmployee.add(new Employee("Maria", 24));
		setEmployee.add(new Employee("Nadiya", 48));

		System.out.println("Before sorting");
		setEmployee.forEach(System.out::println);
		
		System.out.println("Sorting by Comparable");
		setEmployee.stream().sorted((x1, x2) -> x1.compareTo(x2)).forEach(System.out::println);
		
		System.out.println("Sorting by Comparator");
		//??
		setEmployee.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
	} 

	public static void maxModifiedTask14() {
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
				menu(commodity);
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public static void menu(Commodity commodity) {		
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
