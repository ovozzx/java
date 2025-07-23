package practice.mission;

/*
 *
 * 무한 구구단을 출력합니다.
사용자가 입력한 구구단의 결과를 출력합니다.
만약, 3을 입력했다면, 구구단 3단을 출력합니다.
만약, -1을 입력했다면, 구구단 출력 프로그램을 종료해야합니다.
 */

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			System.out.print(">");
			
			int number = consoleInput.nextInt();
			
			if(number == -1) {
				System.out.println("구구단 출력 프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("%d 단 시작" .formatted(number) );
			
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println("%d x %d = %d" .formatted(number, i, number * i));
			}
			
		}
		
	}
}
