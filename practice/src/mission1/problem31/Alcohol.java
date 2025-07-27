package mission1.problem31;

public class Alcohol {

	private String name;
	private int price;
	//private int stock; 개수 제한 없음 
	
	public Alcohol(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}

	
}
