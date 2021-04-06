package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
		Main test = new Main();
		while (true) {
			System.out.println();
			System.out.println("������ ����� ����:");
			System.out.println("1. ������ �������");
			System.out.println("2. �������� ��������� �������");
			System.out.println("3. ������� ��  �������");
			System.out.println("4. �������� ��������� �������");
			System.out.println("5. ������� ��������� �������");
			System.out.println("6. ������ �������� � �������");
			System.out.println("7. �������� �������� � �������");
			System.out.println("8. ������� ������ ���������");
			System.out.println("9. ������� ���������� ���������");
			System.out.println("10. (����) ���� ����� ��������");
			test.taskMinimum(verkhovnaRada);
			System.out.println();
		}
	}
	
	public void taskMinimum(VerkhovnaRada verkhovnaRada) {
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextLine()) {
		case "1":
			verkhovnaRada.addFaction();
			break;
		case "2":
			verkhovnaRada.removeFaction();
			break;
		case "3":
			verkhovnaRada.showAllFactions();
			break;
		case "4":
			verkhovnaRada.clearFaction();
			break;
		case "5":
			verkhovnaRada.showAllFactionDeputys();
			break;
		case "6":
			verkhovnaRada.addDeputyInFaction();
			break;
		case "7":
			verkhovnaRada.removeDeputyFromFaction();
			break;
		case "8":
			verkhovnaRada.showAllFactionBribers();
			break;
		case "9":
			verkhovnaRada.showMostFactionBriber();
			break;
		case "10":
			verkhovnaRada.giveABribeDeputyOfFaction();
			break;
		}
		
	}

}
