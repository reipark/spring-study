package com.javalec.di.apply;

public class MyCalculator {
	
	public MyCalculator() {}
	
	private Calculation calculator;
	
	private int firstNum;
	private int secondNum;
	
	public Calculation getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculation calculator) {
		this.calculator = calculator;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		System.out.println("add");
		this.calculator.add(this.firstNum, this.secondNum);
	}
	
	public void sub() {
		System.out.println("sub");
		this.calculator.sub(this.firstNum, this.secondNum);
	}
	
	public void multi() {
		System.out.println("multi");
		this.calculator.multi(this.firstNum, this.secondNum);
	}
	
	public void div() {
		System.out.println("div");
		this.calculator.div(this.firstNum, this.secondNum);
	}
	
}
