package ua.iviv.lgs;

public class ClassWithTwoOverloadedConstructors {

	public ClassWithTwoOverloadedConstructors() {
		System.out.println("ClassWithTwoOverloadedConstructors()");
	}
	
	public ClassWithTwoOverloadedConstructors(int i) {
		this();
		System.out.println("ClassWithTwoOverloadedConstructors(int " + i + ")");
	}
	
}
