package ua.lviv.lgs;

public class EmployeeWithHourSalary implements Salary{

	@Override
	public void salary() {
		double salary = 100;
		System.out.println("Погодинна зарплата складає: " + salary + " гривень");
	}

}
