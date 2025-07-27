package mission1.problem14;

public class Problem14 {

	
	public static void main(String[] args) {
		
		double numberOne = (Math.random() * 100);
		double numberTwo = (Math.random() * 100);
		double numberThree = (Math.random() * 100);
		
		System.out.println("number 1 : " + numberOne);
		System.out.println("number 2 : " + numberTwo);
		System.out.println("number 3 : " + numberThree);
		
		// 최소값 찾기
		double minNumber = 0.0;
		
		if(numberOne <= numberTwo) {
			minNumber = numberOne;
			if(minNumber >= numberThree) {
				minNumber = numberThree;
			}
		}
		else {
			minNumber = numberTwo;		
			if(minNumber >= numberThree) {
				minNumber = numberThree;
			}
		}

		System.out.println("가장 작은 수 : " + minNumber);
	}
	
	
}
