package mission1.problem5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print(">");
		int number = consoleInput.nextInt();
		isPrimeNumber(number);
		
	}

	public static boolean isPrimeNumber(int number) {
		
		int cnt = 0; 
		
		for(int i = 2 ; i < number ; i++) {
			if (number % i == 0) {
				cnt++;
			}
		}
		
		if(number != 1 && cnt == 0) { // 소수 판별 방 : 2 ~ (자기 자신 - 1)를 나눠본다.
			System.out.println("입력한 숫자는 소수입니다.");
			return true;
		}
		else {
			System.out.println("입력한 숫자는 소수가 아닙니다.");
			return false;
		}
		
	}
	
}