package lgs.interface2;

import lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	int a;
	int b;

	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int plus() {
		return this.a + this.b;
	}

	public int minus() {
		return this.a - this.b;
	}

	public int multiply() {
		return this.a * this.b;
	}

	public double devide() {
		return this.a / this.b;
	}

	public void numerable() {

	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	@Override
	public String toString() {
		return "MyCalculator a= " + a + ", b=" + b + "; \nplus =" + plus() + "; \nminus =" + minus() + "; \nmultiply ="
				+ multiply() + "; \ndevide =" + devide() + "!";
	}

}
