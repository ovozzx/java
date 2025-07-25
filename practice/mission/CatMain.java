package practice.mission;

public class CatMain {

	public static void main(String[] args) {
		
		Cat catOne = new Cat("야옹이1", "코리안 숏헤어", "대형");
		catOne.introduce();
		catOne.cry();
		
		Cat catTwo = new Cat("야옹이2", "노르웨이 숲", "중형");
		catTwo.introduce();
		catTwo.cry();
		
		Cat catThree = new Cat("야옹이3", "메인쿤", "소형");
		catThree.introduce();
		catThree.cry();
		
	}
	
}
