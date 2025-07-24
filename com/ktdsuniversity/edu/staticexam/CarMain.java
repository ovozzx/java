package com.ktdsuniversity.edu.staticexam;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("현재까지 만들어진 Car 인스턴스의 개수");
		System.out.println(Car.instanceCount);
		
		/*
		Car.instanceCount++;
		Car.instanceCount++;
		Car.instanceCount++;
		
		System.out.println(Car.instanceCount);
		*/
		Car car1 = new Car("자동차 1"); // heap 영역에서 관리됨
		System.out.println(car1.getName());
		
		System.out.println("현재까지 만들어진 Car 인스턴스의 개수");
		System.out.println(Car.instanceCount);		

		Car car2 = new Car("자동차 2");
		System.out.println(car2.getName());
		
		System.out.println("현재까지 만들어진 Car 인스턴스의 개수");
		System.out.println(Car.instanceCount);		
	}
}
