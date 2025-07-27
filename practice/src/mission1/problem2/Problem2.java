package mission1.problem2;


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