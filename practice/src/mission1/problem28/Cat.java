package mission1.problem28;


public class Cat {
	
	private String name;
	private String type;
	private String size;
	
	public Cat(String name, String type, String size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	public void introduce() {
		System.out.println("안녕하세요. 나의 이름은 %s 이고, 종류는 %s 이며, 크기는 %s 입니다"
							.formatted(this.name, this.type, this.size));
	}
	
	public void cry() {
		System.out.println("야옹 야옹");
	}
}