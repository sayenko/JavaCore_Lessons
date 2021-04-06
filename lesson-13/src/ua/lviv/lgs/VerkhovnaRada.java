package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class VerkhovnaRada {
	private static VerkhovnaRada instance;
	private List<Faction> factionList = new ArrayList<Faction>();
	
	private VerkhovnaRada() {}
	
	public static VerkhovnaRada getInstance() {
		if(instance == null) {
			instance = new VerkhovnaRada();
		}
		return instance;
	}
	
	public void addFaction() {
		System.out.println("Введіть назву фракції, яку плануєте додати");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		boolean isExists = false;
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				System.out.println("Така фракція вже існує");
				isExists = true;
			}
		}
		if(!isExists) {
			factionList.add(new Faction(factionName));
		}
	}
	
	//????? проверить
	public void removeFaction() {
		System.out.println("Яку фракцію бажаєте видалити?");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		ListIterator<Faction> listIterator = factionList.listIterator();
		
		while(listIterator.hasNext()) {
			if(listIterator.next().getFactionName().equalsIgnoreCase(factionName)) {
				listIterator.remove();
				System.out.println("Фракцію видалено");
			}
		}
	}
	
	public void showAllFactions() {
		for (Faction faction : factionList) {
			System.out.println(faction);
		}
	}
	
	public void showFaction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				System.out.println(faction);
			}
		}
	}
	
	public void addDeputyInFaction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.addDeputy();
			}
		}
	}
	
	public void removeDeputyFromFaction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.removeDeputy();
			}
		}
	}
	
	public void showAllFactionBribers() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.showAllBribers();
			}
		}
	}
	
	public void showMostFactionBriber() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.showMostBriber();
			}
		}
	}
	
	public void showAllFactionDeputys() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.showAllDeputys();
			}
		}
	}
	
	public void clearFaction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.clearFaction();
			}
		}
	}
	
	//для тестування дачі хабара
	public void giveABribeDeputyOfFaction() {
		System.out.println("Введіть назву фракції");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		for (Faction faction : factionList) {
			if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.giveABribe();
			}
		}
	}
}
