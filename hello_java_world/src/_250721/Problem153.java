package _250721;

import java.util.Scanner;

public class Problem153 {

	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		// 백준 : 2739번
		// N을 입력하면, 구구단 N단이 출력되도록 한다.
		int N = consoleInput.nextInt();
		int number = 1;
		while (true) {
			System.out.println(N + "*" + number + " = " + N * number);
			number++;
			if(number == 10) {
				break;
			}
		}
		// N을 입력하면, 1부터 N까지의 합이 출력되도록 한다.
		int increase = 1;
		int sum = 0;
		while (true) {
			sum = sum + increase;
			increase++;
			
			if(increase > N) {
				break;
			}
		}
		System.out.println(sum);
		
		// 백준 25314번
		
	}
}
