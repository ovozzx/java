package vedingmachine;

/**
 * 
 * 상품(음료수)
 */
public class Item {
	
	private String name;
	private int price;
	private int stock;
	
	public Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}

	public int getStock() {
		return this.stock;
	}
	
	/*public void setBuyStock(int orderQuantity) {
		
		if(this.stock > 0) {
			this.stock -= orderQuantity;
		}
		else {
			System.out.println("상품이 품절되었습니다.");
		}
	
	}*/
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setAddStock(int addQuantity) {
		
		if(this.stock > 0) {
			this.stock += addQuantity;
		}
		else {
			System.out.println("상품이 품절되었습니다.");
		}
	
	}
	
	public void printItem() {
		System.out.println("%s %d개 남았습니다." .formatted(this.name, this.stock));
	}
}
