package br.edu.univas.si8.ta.hello.rest.api;

public class Result {

	private int a;
	private int b;
	private int value;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Result withA(int a) {
		this.a = a;
		return this;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Result withB(int b) {
		this.b = b;
		return this;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Result withValue(int value) {
		this.value = value;
		return this;
	}

}
