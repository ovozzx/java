package mission1.problem31;

public class Bar {
		
	private Alcohol[] alcohols;
	private Drink[] drinks;
	
	public Bar(Alcohol[] alcohols, Drink[] drinks) {
		this.alcohols = alcohols;
		this.drinks = drinks;
		
	}

	public void sellAlcohol(Customer customer, String name, int sellCount) { // 손님, 구매 이름, 구매 개수 
		
		int price = 0;
		
		for(int i = 0 ; i < this.alcohols.length ; i++) {
			
			if(this.alcohols[i].getName().equals(name)){
				price = this.alcohols[i].getPrice();
			}
			
		}
		
		if (customer.getAge() >= 19 && customer.getWallet() >= (sellCount * price) && customer.getDrunk() < 10) {
			System.out.println("%s (가격 : %d)을 %d 개 판매하였습니다." .formatted(name, price, sellCount));
			customer.setWallet(sellCount, price); // 지갑 
			customer.setDrunk(sellCount); // 취기 증가  
			System.out.println("지갑에 남은 잔액은 %d 입니다." .formatted(customer.getWallet()));
		}
		else {
			System.out.println(" 나이 : %d, 현재 지갑 잔액 : %d, 현재 취함 정도 : %.2f 로 판매할 수 없습니다." .formatted(customer.getAge(), customer.getWallet(), customer.getDrunk()));
		}
	}
	
	public void sellDrink(Customer customer, String name, int sellCount) { // 손님, 구매 이름, 구매 개수 
		
		int price = 0;
		
		for(int i = 0 ; i < this.drinks.length ; i++) {
			
			if(this.drinks[i].getName().equals(name)){
				price = this.drinks[i].getPrice();
			}
			
		}
		
		if (customer.getWallet() >= (sellCount * price) && customer.getFull() < 20) {
			System.out.println("%s (가격 : %d)을 %d 개 판매하였습니다." .formatted(name, price, sellCount));
			customer.setWallet(sellCount, price); // 지갑 
			customer.setFull(sellCount); // 배부름 증가  
			System.out.println("지갑에 남은 잔액은 %d 입니다." .formatted(customer.getWallet()));
		}
		else {
			System.out.println(" 나이 : %d, 현재 지갑 잔액 : %d, 현재 배부름 정도 : %.2f 로 판매할 수 없습니다." .formatted(customer.getAge(), customer.getWallet(), customer.getFull()));
		}
	}
	
}
