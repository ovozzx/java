package practice.mission;

public class Problem17 {

	public static void main(String[] args) {
		
		int[] numberArr = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			numberArr[i] = (int) (Math.random() * 100);
			System.out.println("number %d : %d" 
								.formatted((i+1), numberArr[i]));
			if(numberArr[i] % 2 == 0
				|| numberArr[i] % 5 == 0
				|| numberArr[i] % 6 == 0) {
				System.out.println("2 or 5 or 6의 배수에 해당 : " + numberArr[i]);
			}
		}

	
	}
	
	
}
