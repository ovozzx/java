package mission1.problem4;

public class Problem4 {
	
	public static void main(String[] args) {
		
		int startNumber = 1;
		int endNumber = 10_000;
		System.out.println(
				"%d 부터 %d 까지 소수의 개수는 %d 개 입니다."
				.formatted(startNumber, endNumber, 
						   checkPrimeNumber(startNumber,endNumber)));
		
	}
	
	public static int checkPrimeNumber(int start, int end) { // static ??
		
		int cntPrimeNumber = 0;
		
		for(int i = start ; i <= end ; i++) {
			int cnt = 0;
			if(i == 1) { // 1은 소수가 아닌 것으로 간주
				continue;
			}
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) { // 추가 약수가 있을 경우
					cnt++;
				}
			}
			if(cnt == 0) {
				cntPrimeNumber++;
			}
		}
		return cntPrimeNumber;
	}

}