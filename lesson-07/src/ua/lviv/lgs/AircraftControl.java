package ua.lviv.lgs;

public class AircraftControl {
	public void Up() {
		int up = (int)(Math.random() * 100);
		System.out.println("˳��� �������� ����� " + up + " ��");
	}
	
	public void Down() {
		int down = (int)(Math.random() * 100);
		System.out.println("˳��� �������� ���� " + down + " ��");
	}
	
	public void Left() {
		int left = (int)(Math.random() * 100);
		System.out.println("˳��� �������� ���� " + left + " ��");
	}
	
	public void Right() {
		int right = (int)(Math.random() * 100);
		System.out.println("˳��� �������� ������ " + right + " ��");
	}
}
