package ua.lviv.lgs;

import com.lgs.lab.interface2.*;

public class Main {

	public static void main(String[] args) {
		
		Salary ewms = new EmployeeWithMonthSalary();
		ewms.salary();
		Salary ewhs = new EmployeeWithHourSalary();
		ewhs.salary();
		
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.plus(20, 5);
		myCalculator.minus(20, 5);
		myCalculator.multiply(20, 5);
		myCalculator.devide(20, 5);
	}

}
