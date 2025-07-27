package mission1.problem1;

public class Problem1 {
	
	public static void main(String[] args) {
		
		int customerMoney = 10000;
		int movieCost= 18000;
		
		if(customerMoney >= movieCost) {
			System.out.println("관람가능");
		}
		else {
			System.out.println("관람불가능, 모자란 금액은 %d 원입니다." .formatted(movieCost - customerMoney));
		}
	}

}
