package practice.mission;

public class TradeMain {
	
	public static void main(String[] args) {
	
		
		Seller seller = new Seller(10, 0, 5000);
		Customer customer = new Customer(20000, 0);
		
		customer.buy(2, seller);
		customer.printCustomerState();
		seller.printSellerState();
		
		customer.buy(1, seller);
		customer.printCustomerState();
		seller.printSellerState();
		
		customer.buy(1, seller);
		customer.printCustomerState();
		seller.printSellerState();
		
		customer.buy(1, seller);
		customer.printCustomerState();
		seller.printSellerState();
		
		System.out.println("--------");
		
		Seller sellerTwo = new Seller(2, 0, 5000);
		Customer customerTwo = new Customer(20000, 0);
		
		// 구매자가 판매자에게서 구매하려는 상품의 개수가 더 클 경우
		customerTwo.buy(3, sellerTwo);
		customerTwo.printCustomerState();
		sellerTwo.printSellerState();

	}

}
