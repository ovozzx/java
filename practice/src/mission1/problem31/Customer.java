package mission1.problem31;

public class Customer {
	
	private String name;
	private int age;
	private int wallet;
	private double drunk;
	private double full;
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param wallet
	 * @param drunk
	 * @param full
	 */
	public Customer(String name, int age, int wallet, int drunk, int full) {
		this.name = name;
		this.age = age;
		this.wallet = wallet;
		this.drunk = drunk;
		this.full = full; 
	}
	
	public int getAge() {
		return this.age;
	
	}
	public int getWallet() {
		return this.wallet;
	
	}
	
	public double getDrunk() {
		return this.drunk;
	
	}
	
	public double getFull() {
		return this.full;
	
	}
	
	public void setWallet(int sellCount, int price) {
		this.wallet -= (price * sellCount);
	
	}
	
	public void setDrunk(int sellCount) {
		this.drunk += (double) (0.5 * sellCount);
	
	}
	
	public void setFull(int sellCount) {
		this.full += (double) (0.2 * sellCount) ;
	
	}

}
