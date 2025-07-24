package vedingmachine.copy;

/**
 * 
 * 음료수 자판기
 */
public class VendingMachine {
	
	private Item[] products; // 에러 : 생성자가 없다 (배열 매개변수로 받는 아래와 같은 생성자)
	 
	public VendingMachine(Item[] products) {
		this.products = products;
	}
	
	public int buyProduct(String productName, int orderQuantity) {
		
		int amount = 0;
		
		for(int i = 0 ; i < this.products.length ; i++) {
			
			Item eachItem = this.products[i];
			String eachItemName = eachItem.getName();
			int eachItemStock = eachItem.getStock();
			
			if(eachItemName.equals(productName)
					&& eachItemStock >= orderQuantity) { // 제품 존재 & 재고 충분
				eachItem.setStock(eachItemStock - orderQuantity);
				amount = orderQuantity * eachItem.getPrice();
				// return (값 반환, 현재 실행 중인 메소드를 즉시 종료시킨다.)
				return amount; // 반복문 & 메소드 모두 종료 -> 반환되지 않았다면, 제품이 없거나 재고가 없다
			}
		

		}
		
		
		System.out.println(productName + " 상품이 품절되었습니다.");
		return 0;
		
	}
	/*
	public void buyProduct(String itemName, int orderQuantity) {
		
		for(int i = 0 ; i < this.products.length ; i++) {
			if(this.products[i].getName().equals(itemName)) {
				
				if(this.products[i].getStock() >= orderQuantity) {
				
					System.out.println("제품 %s를 %d개 구매하였습니다."
					           .formatted(this.products[i].getName(),
					        		      orderQuantity));
					this.products[i].setBuyStock(orderQuantity);
				
				}
				else {
					
					System.out.println("제품 %s를 %d개 구매를 원하였으나, 상품이 품절되었습니다."
					           .formatted(this.products[i].getName(),
					        		      orderQuantity));

					// 0 반환
				}
						
			}

		}
		
		
	}*/

	public void addProduct(String ProductName, int addQuantity) {
		for(int i = 0 ; i < this.products.length ; i++) {
			/*if(this.products[i].getName().equals(ProductName)) {
				System.out.println("제품 %s를 %d개 입고하였습니다."
						           .formatted(this.products[i].getName(),
						        		      addQuantity));
				this.products[i].setAddStock(addQuantity);
			}*/
			Item eachItem = this.products[i];
			String eachItemName = eachItem.getName();
			
			if(eachItemName.equals(ProductName)) {
				int eachItemStock = eachItem.getStock();
				eachItem.setStock(eachItemStock + addQuantity);
				
				// addProduct 메소드를 즉시 종료시킨다 (+ for도 함께 종료)
				return; // void여도 쓸 수 있음 return에 반환값 없으면 됨
			}
		}
	}
	
	public void printAllProducts() {
		
		/*System.out.println("현재 재고 : ");
		for(int i = 0 ; i < this.products.length ; i++) {
			System.out.println("상품명 : %s, 가격 : %d 개, 재고 : %d 원" 
					           .formatted( this.products[i].getName(),
						        		   this.products[i].getPrice(),
						        		   this.products[i].getStock()));
			
		}
		System.out.println("--------------------");	
		*/
		for(int i = 0 ; i < this.products.length ; i++) {
			this.products[i].printItem();
		}
	}
}
