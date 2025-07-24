package com.ktdsuniversity.edu.foodtruck;

public class TruckMain {

	public static void main(String[] args) {
		
		Truck 붕어빵 = new Truck();
		붕어빵.sell(50);
		붕어빵.sell(3);
		붕어빵.sell();
		
		붕어빵.printMoney();
		
		Truck 스테이크 = new Truck(50_000);
		스테이크.sell(50);
		스테이크.sell(3);
		스테이크.sell();
		스테이크.printMoney();
	}
	
	
}
