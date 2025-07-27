package mission1.problem27;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Animal dogOne = new Animal("우유", "강아지", "멍멍");
		dogOne.introduce();
		dogOne.cry(); 
		
		Animal dogTwo = new Animal("멍멍이", "강아지", "왈왈");
		dogTwo.introduce();
		dogTwo.cry(); 
		
		Animal catOne = new Animal("냐옹이1", "고양이", "냐옹");
		catOne.introduce();
		catOne.cry(); 
		
		Animal catTwo = new Animal("냐옹이2", "고양이", "냐옹");
		catTwo.introduce();
		catTwo.cry(); 
		
		Animal catThree = new Animal("냐옹이3", "고양이", "냐옹");
		catThree.introduce();
		catThree.cry(); 
	}

}
