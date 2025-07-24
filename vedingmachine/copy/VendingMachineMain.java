package vedingmachine.copy;

/**
 * 
 * 메인
 */
public class VendingMachineMain {

	public static void main(String[] args) {
		
		Item[] items = new Item[4]; // 원래 이렇게 만들면 안됨
		items[0] = new Item("박카스", 900, 15);
		items[1] = new Item("몬스터", 1500, 20);
		items[2] = new Item("핫식스", 1300, 10);
		items[3] = new Item("밀키스", 1400, 5);
		
		VendingMachine Machine = new VendingMachine(items);
		
		/*
		Machine.buyProduct("박카스", 2);
		Machine.printAllProducts();
		
		Machine.addProduct("몬스터", 3);
		Machine.printAllProducts();
		
		Machine.buyProduct("밀키스", 10);
		Machine.printAllProducts();
		
		Machine.addProduct("핫식스", 3);
		Machine.printAllProducts();
		*/
		
		Machine.printAllProducts();
		
		Machine.addProduct("몬스터", 50);
		Machine.printAllProducts();
		
		int amount = Machine.buyProduct("박카스", 10);
		System.out.println(amount);
	}
}
