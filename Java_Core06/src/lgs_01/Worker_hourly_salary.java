package lgs_01;

public class Worker_hourly_salary implements Salary {

	private int hour_rate;

	public Worker_hourly_salary(int hour_rate) {
		this.hour_rate = hour_rate;

	}

	public int getSalary(int number_of_hours) {
		return hour_rate * number_of_hours;
	}

}
