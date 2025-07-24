package com.ktdsuniversity.edu.staticexam;

public class Car {

	public static int instanceCount; // class field

	static { // class field constructor
		instanceCount = 0;
	}
	
	
	private String name; // instance field (멤버변수)
	
	public Car(String name) {
		this.name = name;
		//this.instanceCount++; // -> 인스턴스로 접근하고 있어서 경고 발생
		Car.instanceCount++; // 클래스로 접근
	}
	
	public String getName() { // instance method
		return this.name;
	}
}
