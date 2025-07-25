package practice.mission;

public class Animal {
	
	private String name;
	private String type; // 강아지, 고양이
	private String sound;

	public Animal(String name, String breed, String sound) {
		this.name = name;
		this.type = breed;
		this.sound = sound;
	}

	public void introduce() {
		System.out.println("안녕하세요. 나의 이름은 %s 입니다. 나의 종류는 %s 입니다." .formatted(this.name, this.type));
	}
	
	public void cry() {
		System.out.println(this.sound);
	}

}
