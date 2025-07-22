package _250721;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		System.out.println("직업 입력하는 계산기");
	
		// 키보드의 입력을 받아들이는 코드
		Scanner consoleInput = new Scanner(System.in);
		
		//int numberOne = 10; // hard coding
		//int numberTwo = 20;
		int numberOne = consoleInput.nextInt(); // f6 누르면 녹색바 사라짐 (입력 기다리는 것)
		int numberTwo = consoleInput.nextInt();
		
		String operator = consoleInput.next(); // 문자열 작은 따옴표 안됨 
		
		if(operator.equals("+")) {
			int additionResult = numberOne + numberTwo;
			System.out.println(additionResult); // alt 키 누른채로 방향키로 이동 가능 (mac은 option 키로)
		}
		else if(operator.equals("-")) {
			int subtractionResult = numberOne - numberTwo;
			System.out.println(subtractionResult);			
		}
		else if(operator.equals("*")) {
			int multicationResult = numberOne * numberTwo;
			System.out.println(multicationResult);			
		}
		else {
			int divisionResult = numberOne / numberTwo;
			System.out.println(divisionResult);			
		}
	}
}
