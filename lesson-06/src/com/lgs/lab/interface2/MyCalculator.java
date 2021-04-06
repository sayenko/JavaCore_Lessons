package com.lgs.lab.interface2;

import com.lgs.lab.interface1.*;

public class MyCalculator implements Numerable{

	@Override
	public void plus(double a, double b) {
		System.out.println("a + b = " + (a + b));
	}

	@Override
	public void minus(double a, double b) {
		System.out.println("a - b = " + (a - b));
	}

	@Override
	public void multiply(double a, double b) {
		System.out.println("a * b = " + (a * b));
	}

	@Override
	public void devide(double a, double b) {
		System.out.println("a / b = " + (a / b));
	}

}
