package mission1.problem12;

public class Problem12 {
	
	public static void main(String[] args) {
		
		int numberOne = 4;
		int numberTwo = 3;
		
		double result = (double) numberOne / numberTwo;
		
		System.out.println("나누기 결과 : %f" .formatted(result));
		//System.out.println("나누기 결과 (올림) : %.2f" .formatted(result));
		// 셋째 자리에서 올림
		System.out.println("나누기 결과 (올림) : %.2f" .formatted(Math.ceil(result * 100) / 100.0));
		
	}

}
