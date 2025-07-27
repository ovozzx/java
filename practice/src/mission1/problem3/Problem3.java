package mission1.problem3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("연산자를 입력하세요.");
			System.out.print(">");
			String operator = consoleInput.next();
			
			if(operator.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("숫자 1을 입력하세요.");
			System.out.print(">");
			int number1 = consoleInput.nextInt();
			
			System.out.println("숫자 2를  입력하세요.");
			System.out.print(">");
			int number2 = consoleInput.nextInt();
			
			System.out.println("결과 : "
								+ calculator(operator, number1, number2));
		}
		
		
	}
	
	public static int calculator(String operator, int number1, int number2) {
		
		int result = 0;
		
		if(operator.equals("+")) {
			result = number1 + number2;
		}
		else if(operator.equals("-")) {
			result = number1 - number2;
		}
		else if(operator.equals("*")) {
			result = number1 * number2;
		}
		else if(operator.equals("/")) {
			result = number1 / number2;
		}
		
		return result;
	}
}