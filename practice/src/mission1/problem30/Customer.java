package mission1.problem30;

public class Customer {
	
	private int wallet;
	private int cart;
	
	/**
	 * 
	 * @param wallet
	 * @param cart
	 */
	public Customer(int wallet, int cart) {
		this.wallet = wallet;
		this.cart = cart;
	}
	
	void buy(int buyCount, Seller seller) {
		
		if(this.wallet >= (buyCount * seller.getPrice())) {
			if(seller.getStock() >= buyCount) {				
				this.wallet -= (buyCount * seller.getPrice());
				this.cart += buyCount;
				seller.setIncome(buyCount);	
				seller.setStock(buyCount);
							
			}
			else {
				this.wallet -= (seller.getStock() * seller.getPrice());
				this.cart += seller.getStock();
				seller.setIncome(seller.getStock());	
				seller.setStock(seller.getStock());
				
			}

			
		}
		else {
			System.out.println("지갑 잔액이 부족합니다.");
		}

	}
	
	public void printCustomerState() {
		System.out.println("구매자의 상품 수 : " + this.cart + " 개");
		System.out.println("구매자의 지갑 현황 : " + this.wallet + " 원");
	}


}
