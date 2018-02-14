package com.javalec.di.apply2;

import java.util.ArrayList;

public class MyInfo {
	
	private String name;
	private long height;
	private long weight;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getHeight() {
		return height;
	}
	
	public void setHeight(long height) {
		this.height = height;
	}
	
	public long getWeight() {
		return weight;
	}
	
	public void setWeight(long weight) {
		this.weight = weight;
	}
	
	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public void bmiCalculation() {
		bmiCalculator.bmiCalculation(weight, height);
	}

	public void getInfo() {
		// System.out.println("name = " + this.name + ", height = " + this.height + ", weight = " + this.weight);
		System.out.println("이름 : " + this.name);
		System.out.println("키 : " + this.height);
		System.out.println("몸무게 : " + this.weight);
		System.out.println("취미 : " + this.hobbys);
		bmiCalculation();
	}
	
}
