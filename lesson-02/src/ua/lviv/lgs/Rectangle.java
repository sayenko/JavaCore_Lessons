package ua.lviv.lgs;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {
		this.length = 29;
		this.width = 16;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int square() {
		int square = length * width;
		return square;
	}
	
	public int perimeter() {
		int perimeter = 2 * (length + width);
		return perimeter;
	}

	@Override
	public String toString() {
		return "Площа прямокутника = " + square() + ", Периметр прямокутника = " + perimeter();
	}
	
	
}
