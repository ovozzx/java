package practice.mission;

import java.util.Scanner;

public class Problem19 {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			System.out.print(">");
			int number = consoleInput.nextInt();
			
			if(number % 2 != 0
				|| number == 0
				|| number < 0) {
				System.out.println("게임을 마칩니다.");
				break;
			}
		}
	

	
	}

}

