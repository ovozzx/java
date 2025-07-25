package practice.mission.problem31;

public class Bar {
	
	private Drinks[] drinks;
	private Alchol[] alchols;
	private Customer[] customers;
	
	public Bar(Drinks[] drinks, Alchol[] alchols, Customer[] customers) {
		this.drinks = drinks;
		this.alchols = alchols;
		this.customers = customers;
	}
	
	
	void sellDrinks(int sellCount) {
		if(this.customers.full < 20
			&& this.customers.age >= 20
			&& this.customers.wallet >=  (this.drinks.price * sellCount)) {
			this.customers.full += 0.2;
		}
		else {
			System.out.println("판매할 수 없습니다.");
		}
	}
	
	void sellAlchol(int sellCount) {
		if(this.customers.drunk < 20
			&& this.customers.age >= 20
			&& this.customers.wallet >= (this.alchols.price * sellCount)){
			this.customers.drunk += 0.5;
		}
		else {
			System.out.println("판매할 먹을 수 없습니다.");
		}
		
	}
}
