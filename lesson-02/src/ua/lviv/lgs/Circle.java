package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;
	
	public Circle() {
		this.radius = 10.5;
		this.diameter = 2 * radius;
	}
	
	public void areaÑircle() {
		double areaÑircle = 3.14 * (diameter/2)*(diameter/2);
		System.out.println("Ïëîùà êîëà = " + areaÑircle);		
	}
	
	public void circleLength() {
		double circleLength = 2 * 3.14 * radius;
		System.out.println("Äîâæèíà êîëà = " + circleLength);
	}
}
