package ua.lviv.lgs;

public class Su27 extends Plane implements Possibilable{

	private int maxSpeed;
	private String color;	
	private AircraftControl aircraftControl = new AircraftControl();	
	
	public Su27(int maxSpeed, String color) {
		//super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAcceleration() {
		int turboSpeed = (int)(Math.random() * 100 + maxSpeed) ;
		System.out.println("����� �����������: " + turboSpeed + " ��/���");
	}

	@Override
	public void stealthTechnology() {
		int stealthTime = (int)(Math.random()*500);
		System.out.println("˳���� �� ���� ����� �������� " + stealthTime + " ������.");
	}

	@Override
	public void nuclearStrike() {
		int missilesNumber = (int)((Math.random() + 0.1) * 10);
		System.out.println("���� ������� " + missilesNumber + " ���������.");
	}
	
	public void moveUp() {
		aircraftControl.Up();
	}
	
	public void moveDown() {
		aircraftControl.Down();
	}
	
	public void moveLeft() {
		aircraftControl.Left();
	}
	
	public void moveRigh() {
		aircraftControl.Right();
	}
}
