package ua.lviv.lgs;

public class EmployeeWithMonthSalary implements Salary{

	@Override
	public void salary() {
		double salary = 20000;
		System.out.println("Місячна зарплата складає: " + salary + " гривень");
	}

}
