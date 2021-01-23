package lgs_01;

public class Worker_fixed_salary implements Salary {

	private int month_rate;

	public Worker_fixed_salary(int month_rate) {
		this.month_rate = month_rate;
	}

	public int getSalary(int bonus) {
		return month_rate + 60;
	}

}
