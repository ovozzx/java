package practice.mission;

public class Problem13 {

	public static void main(String[] args) {
		
		int numberOne = (int) (Math.random() * 100);
		int numberTwo = (int) (Math.random() * 100);
		
		System.out.println("number 1 : " + numberOne);
		System.out.println("number 2 : " + numberTwo);
		
		if(numberOne == numberTwo) {
			System.out.println(numberOne);
		}
		else if(numberOne > numberTwo) {
			System.out.println(numberOne);
		}
		else {
			System.out.println(numberTwo);
		}
	
	}
	
}
