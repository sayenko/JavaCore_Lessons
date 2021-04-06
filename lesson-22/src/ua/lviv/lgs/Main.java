package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {		
		Pet cow = () -> System.out.println("ß êîðîâà- Ìóóó-Ìóóó");
		cow.voice();
		Pet cat = () -> System.out.println("ß ê³ò- Ìÿóóó-Ìÿóóó");
		cat.voice();
		Pet dog = () -> System.out.println("ß ïåñ - Ãàóóó-Ãàóóó");
		dog.voice();
		
		System.out.println();
		
		OverloadedConstructor overloadedConstructor = ClassWithTwoOverloadedConstructors::new;
		overloadedConstructor.overloaded(100);
		
		System.out.println();
		
		Amphibia frogEating = () -> System.out.println("I am eating");
		frogDoSomething(frogEating);		
		Amphibia frogSleeping = () -> System.out.println("I am sleeping");
		frogDoSomething(frogSleeping);		
		Amphibia frogSwimming = () -> System.out.println("I am swimming");
		frogDoSomething(frogSwimming);		
		Amphibia frogWalking = () -> System.out.println("I am walking");
		frogDoSomething(frogWalking);		
	}
	
	public static void frogDoSomething(Amphibia whatToDo) {
		whatToDo.doSomething();
	}

}

//1 task
interface Pet {	
	public void voice();
}

//2 task
interface OverloadedConstructor{
	ClassWithTwoOverloadedConstructors overloaded(int i);
}

class ClassWithTwoOverloadedConstructors {
	public ClassWithTwoOverloadedConstructors() {
		System.out.println("ClassWithTwoOverloadedConstructors()");
	}
	
	public ClassWithTwoOverloadedConstructors(int i) {
		this();
		System.out.println("ClassWithTwoOverloadedConstructors(int " + i + ")");
	}	
}

//3 task
interface Amphibia {	
	public void doSomething();	
}
