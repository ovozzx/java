package com.ktdsuniversity.edu.foodtruck;

public class Truck {
	
	public static final int PRICE;
	
	static {
		PRICE = 3_000;
		
	}
	
	private int money;
	
	// 생성자 오버로딩
	public Truck() {
		//this.money = 1000;
		this(1_000); // 생성자가 생성자를 실행
	}
	
	public Truck(int money) {
		this.money = money;
	}
	
	public void sell() {
		//this.money += Truck.PRICE;
		// 파라미터가 적은쪽을 수정!
		this.sell(1); //this.sell();로 하면 무한반복되면서 JVM이 죽여버림 (디버깅할 때 왼쪽 트리가 call stack -> 쌓이다가 limit 넘으면 죽음) 
	}
	
	public void sell(int orderCount) {
		this.money += orderCount * Truck.PRICE;
	}
	
	public void printMoney() {
		System.out.println("오늘의 매출 : " + this.money + " 원");
	}

}
