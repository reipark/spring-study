package com.javalec.di.apply;

public class Calculation {
	
	/**
	 * 덧셈
	 */
	public void add(int firstNum, int secondNum) {
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	}
	
	/**
	 * 뺄셈
	 */
	public void sub(int firstNum, int secondNum) {
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
	}
	
	/**
	 * 곱셈
	 */
	public void multi(int firstNum, int secondNum) {
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
	}
	
	/**
	 * 나눗셈
	 */
	public void div(int firstNum, int secondNum) {
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
	}
	
}
