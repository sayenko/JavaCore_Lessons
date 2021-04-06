package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		ZooClub zooClub = new ZooClub();
		while (true) {
			System.out.println("Оберіть пункт меню:");
			System.out.println("1. Додати учасника клубу");
			System.out.println("2. Додати тваринку до учасника клубу");
			System.out.println("3. Видалити тваринку з учасника клубу");
			System.out.println("4. Видалити учасника з клубу");
			System.out.println("5. Видалити конкретну тваринку зі всіх власників");
			System.out.println("6. Вивести на екран зооклуб");
			System.out.println("7. Вийти з програми");
			try {
				main.menu(zooClub);
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void menu(ZooClub zooClub) {		
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextLine()) {
		case "1":
			zooClub.addClubMember();
			break;
		case "2":
			zooClub.addPet();
			break;
		case "3":
			zooClub.removePetFromClubMember();
			break;
		case "4":
			zooClub.removeClubMember();
			break;
		case "5":
			zooClub.removePet();
			break;
		case "6":
			zooClub.showZooClub();
			break;
		case "7":
			zooClub.exit();
			break;
		}
	}
}