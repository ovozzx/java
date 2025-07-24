package practice.mission;

public class Problem15 {


	public static void main(String[] args) {
		
		double[] numberArr = new double[5];
		numberArr[0] = (Math.random() * 100);
		numberArr[1] = (Math.random() * 100);
		numberArr[2] = (Math.random() * 100);
		numberArr[3] = (Math.random() * 100);
		numberArr[4] = (Math.random() * 100);
		
		System.out.println("number 1 : " + numberArr[0]);
		System.out.println("number 2 : " + numberArr[1]);
		System.out.println("number 3 : " + numberArr[2]);
		System.out.println("number 3 : " + numberArr[3]);
		System.out.println("number 3 : " + numberArr[4]);
		
		double sum = numberArr[0] 
				+ numberArr[1] 
				+ numberArr[2] 
				+ numberArr[3]
				+ numberArr[4];
		double avg = (double) sum / numberArr.length;
		System.out.println("평균 : " + avg);
		
		// 평균보다 큰 값만 출력
		for(int i = 0 ; i < numberArr.length ; i++) {
			if(numberArr[i] > avg) {
				System.out.println(numberArr[i]);
			}
		}

	
	}
	
	
}
