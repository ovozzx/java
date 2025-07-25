package practice.mission.problem31;


public class Customer {
	
	private String name;
	private int age;
	private int wallet;
	private int drunk; // 취함 정도
	private int full; // 배부름 정도

	/**
	 * 
	 * @param name
	 * @param age
	 * @param full
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
	

}
