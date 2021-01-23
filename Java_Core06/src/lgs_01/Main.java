package lgs_01;

public class Main {

	public static void main(String[] args) {

		Worker_hourly_salary a1 = new Worker_hourly_salary(5);
		System.out.println("1 =" + a1.getSalary(200) + " euro!");

		Worker_fixed_salary a2 = new Worker_fixed_salary(1298);
		System.out.println("2 =" + a2.getSalary(60) + " euro");
	}
}
