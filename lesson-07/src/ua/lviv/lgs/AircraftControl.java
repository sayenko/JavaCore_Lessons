package ua.lviv.lgs;

public class AircraftControl {
	public void Up() {
		int up = (int)(Math.random() * 100);
		System.out.println("Літак рухається вгору " + up + " км");
	}
	
	public void Down() {
		int down = (int)(Math.random() * 100);
		System.out.println("Літак рухається вниз " + down + " км");
	}
	
	public void Left() {
		int left = (int)(Math.random() * 100);
		System.out.println("Літак рухається вліво " + left + " км");
	}
	
	public void Right() {
		int right = (int)(Math.random() * 100);
		System.out.println("Літак рухається вправо " + right + " км");
	}
}
