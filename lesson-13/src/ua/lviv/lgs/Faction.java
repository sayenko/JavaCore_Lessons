package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Faction {
		
	private String factionName;
	private List<Deputy> deputiesList;

	public Faction(String factionName) {
		this.factionName = factionName;
		deputiesList = new ArrayList<Deputy>();
	}
	
	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}
	
	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + "]";
	}

	public void addDeputy() {
		System.out.println("������ �������� � �������:");
		deputiesList.add(createADeputy());
	}
	
	public void removeDeputy() {
		System.out.println("�������� �������� � �������");
		Deputy removeDeputy = createADeputy();
		ListIterator<Deputy> listIterator = deputiesList.listIterator();
		
		while(listIterator.hasNext()) {
			Deputy next = listIterator.next();
			if(next.getSurname().equals(removeDeputy.getSurname())&&
					next.getName().equals(removeDeputy.getName())&&
					next.getAge()==removeDeputy.getAge()&&
					next.getHeight()==removeDeputy.getHeight()&&
					next.getWeight()==removeDeputy.getWeight()&&
					next.isBribeTaker()==removeDeputy.isBribeTaker()) {
				listIterator.remove();
			}
		}
		
	}
	
	public void showAllBribers() {
		for (Deputy deputy : deputiesList) {
			if(deputy.isBribeTaker()) {
				System.out.println(deputy);
			}
		}
	}
	
	public void showMostBriber() {
		Deputy mostBriber = null;
		int briber = 0;
		
		for (Deputy deputy : deputiesList) {
			if(deputy.getSizeOfTheBribe()>briber) {
				briber = deputy.getSizeOfTheBribe();
				mostBriber = deputy;
			}
		}
		System.out.println(mostBriber);
	}
	
	//��� ���������� ���� ������
	public void giveABribe() {
		Scanner scanner = new Scanner(System.in);
				
		
		System.out.println("������� ���������");
		String surname = scanner.nextLine();	
		
		System.out.println("��'� ���������");
		String name = scanner.nextLine();
		
		int bribe;
		while(true) {
			try {
				for (Deputy deputy : deputiesList) {
					if(deputy.getSurname().equals(surname)&&
							deputy.getName().equals(name)) {
						deputy.giveABribe();
					}
				}
				break;
			} catch (Exception e) {}
		}
	}
	
	public void showAllDeputys() {
		for (Deputy deputy : deputiesList) {
			System.out.println(deputy);
		}
	}
	
	public void clearFaction() {
		deputiesList.clear();
	}
	
	private Deputy createADeputy() {		
		Scanner scanner = new Scanner(System.in);
		
		String surname;
		while(true) {
			System.out.println("������� ������� ��������");
			surname = scanner.nextLine();
			if(surname!=null) {
				break;
			}
		}
		
		
		String name;
		while(true) {
			System.out.println("������� ��'� ��������");
			name = scanner.nextLine();
			if(name!=null) {
				break;
			}
		}
		
		System.out.println("������� �� ��������");
		int age;
		while(true) {
			try {
				age = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("������� ��������� ��");
				scanner.next();
			}
		}
		
		System.out.println("������� ���� ��������");
		int weight;
		while(true) {
			try {
				weight = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("������� �������� ����");
				scanner.next();
			}
		}		
		
		System.out.println("������� ���� ��������");		
		int height;
		while(true) {
			try {
				height = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("������� ��������� ����");
				scanner.next();
			}
		}		
		
		System.out.println("�� ���� ��� ������� ����� �����? ���/ͳ");
		boolean bribeTaker;
		while(true) {
			String isBribeTaker = scanner.next();			
			if(isBribeTaker.equalsIgnoreCase("���")) {
				bribeTaker = true;
				break;
			} else if (isBribeTaker.equalsIgnoreCase("�")) {
				bribeTaker = false;
				break;
			} else {
				System.out.println("�������: ��� �� ͳ");
			}
		}
		
		return new Deputy(weight, height, surname, name, age, bribeTaker);
	}
	
}
