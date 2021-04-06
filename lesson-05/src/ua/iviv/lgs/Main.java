package ua.iviv.lgs;

public class Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.voice();
		Cat cat = new Cat();
		cat.voice();
		Dog dog = new Dog();
		dog.voice();
		
		ClassWithTwoOverloadedConstructors cwtoc = new ClassWithTwoOverloadedConstructors(6);
		
		Amphibia frog = new Frog();
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();
	}

}
