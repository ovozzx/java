package practice.mission;

// 판매자
public class Seller {

	private int stock;
	private int income;
	private int price;
	
	/**
	 * 
	 * @param stock
	 * @param income
	 * @param price
	 */
	public Seller(int stock, int income, int price) {
		this.stock = stock;
		this.income = income;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int buyCount) {
		this.stock -= buyCount;
	
	}
	
	public void setIncome(int buyCount) {
		this.income += (this.price * buyCount);
	}
	
	public void printSellerState() {
		System.out.println("판매자의  상품 수 : " + this.stock + " 개");
		System.out.println("판매자의  상품 가격 : " + this.price + " 원");
		System.out.println("판매자의  금고 현황 : " + this.income + " 원");
	}
}
