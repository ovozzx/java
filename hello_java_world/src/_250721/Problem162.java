package _250721;

public class Problem162 {
	public static void main(String[] args) {
		
		
		// 1번
		int sum = 0;
		for(int i = 1 ; i <= 100 ;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 2번
		int sum2 = 0;
		for(int i = 1 ; i <= 100 ;i++) {
			if(i % 2 != 0) {
				sum2 += i;
			}
			
		}
		System.out.println(sum2);		
		
		// 4번 (1)
		String star = "";
		for(int i = 0 ; i < 5 ; i++) {
			star += "*";
			System.out.println(star);
		}
		
		// 4번 (2)
		for(int i = 1 ; i < 6 ; i++) {
			System.out.println("*".repeat(i));
		}
		
		// 4번 (3)
		for(int i = 1 ; i < 6 ; i++) {
			
			for(int j = 1 ; j <= i ; j ++) { // 중괄호 내부라서, i 또 못씀
				System.out.print("*"); // 엔터 안 침 (옆으로 출력)
			}
			System.out.println(); // 한 줄 띄움
		}
	}

}
