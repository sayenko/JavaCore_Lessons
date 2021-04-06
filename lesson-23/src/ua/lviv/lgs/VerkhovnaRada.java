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
		System.out.println("������ ����� �������, ��� ������� ������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();

		if (factionList.stream().noneMatch(s -> s.getFactionName().equalsIgnoreCase(factionName))) {
			factionList.add(new Faction(factionName));
	    } else {
	    	System.out.println("���� ������� ��� ����");
	    }
	}
	
	public void removeFaction() {
		System.out.println("��� ������� ������ ��������?");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		factionList.removeIf(s -> s.getFactionName().equalsIgnoreCase(factionName));
	}
	
	public void showAllFactions() {
		factionList.forEach(System.out::println);
	}
	
	
	public void clearFaction() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.clearFaction();		
	}

	
	public void showAllFactionDeputys() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.showAllDeputys();
	}
	
	
	public void addDeputyInFaction() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.addDeputy();
	}
	
	
	public void removeDeputyFromFaction() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.removeDeputy();
	}
	
	
	public void showAllFactionBribers() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.showAllBribers();
	}
	
	
	public void showMostFactionBriber() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.showMostBriber();
	}
	
		
	//��� ���������� ���� ������
	public void giveABribeDeputyOfFaction() {
		System.out.println("������ ����� �������");
		Scanner scanner = new Scanner(System.in);
		String factionName = scanner.nextLine();
		
		Faction faction = factionList.stream().filter(s -> s.getFactionName().equalsIgnoreCase(factionName)).findFirst().get();
		faction.giveABribe();
	}
}
