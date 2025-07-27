package mission1.problem31;

public class BarMain {
	
	public static void main(String[] args) {
		
		Alcohol[] alcohols = new Alcohol[2];
		alcohols[0] = new Alcohol("소주", 4000);
		alcohols[1] = new Alcohol("맥주", 3000);
		
		Drink[] drinks = new Drink[2];
		drinks[0] = new Drink("콜라", 1500);
		drinks[1] = new Drink("사이다", 1000);		
		
		Bar bar = new Bar(alcohols, drinks);
		
		// (String name, int age, int wallet, int drunk, int full) 
		Customer[] customers = new Customer[3];
		customers[0] = new Customer("소영", 30, 20000, 0, 0);
		customers[1] = new Customer("영소", 18, 10000, 0, 0);
		customers[2] = new Customer("영영", 40, 100000, 0, 0);
		
		bar.sellAlcohol(customers[0], "소주", 3);
		bar.sellAlcohol(customers[0], "맥주", 4);
		
		bar.sellAlcohol(customers[1], "소주", 3);
		bar.sellDrink(customers[1], "콜라", 4);		
		bar.sellDrink(customers[1], "사이다", 6);	
		
		bar.sellAlcohol(customers[2], "소주", 20);	
		bar.sellAlcohol(customers[2], "소주", 1);	 // 첫구매를 취함 or 배부름 정도 이상으로 살 경우?

				
	}

	
}
