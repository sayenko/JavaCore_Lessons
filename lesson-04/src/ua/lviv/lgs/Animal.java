package ua.lviv.lgs;

public class Animal {

	private String name;
	private int velocity;
	private int age;
	
	public Animal(String name, int velocity, int age) {
		super();
		this.name = name;
		this.velocity = velocity;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Animal a = new Animal("tiger", 30, 6);
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getVelocity() + " км/год, Вік тварини = " + a.getAge() + " років");
		a.setName("monkey");
		a.setVelocity(5);
		a.setAge(15);
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getVelocity() + " км/год, Вік тварини = " + a.getAge() + " років");
	}
}
