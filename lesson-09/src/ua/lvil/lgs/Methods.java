package ua.lvil.lgs;

public class Methods {
	
	public void plus(double a, double b) throws IllegalAccessException, MyException {
		exception(a, b);
		System.out.println("a + b = " + (a + b));
	}

	public void minus(double a, double b) throws IllegalAccessException, MyException {
		exception(a, b);
		System.out.println("a - b = " + (a - b));
	}

	public void multiply(double a, double b) throws IllegalAccessException, MyException {
		exception(a, b);
		System.out.println("a * b = " + (a * b));
	}

	public void devide(double a, double b) throws IllegalAccessException, MyException {
		exception(a, b);
		System.out.println("a / b = " + (a / b));
	}
	
	private static void exception(double a, double b) throws IllegalAccessException, MyException {
		if(a<0 && b<0) {
			throw new IllegalArgumentException();
		} else if ((a==0 && b!=0)||(a!=0 && b==0)) {
			throw new ArithmeticException();
		} else if(a==0 && b==0) {
			throw new IllegalAccessException();
		} else if (a>0 && b>0) {
			throw new MyException();
		}
	}
}
