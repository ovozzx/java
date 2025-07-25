package _250721;

import java.util.Scanner;

public class WhileExam {
	public static void main(String[] args) {
		
		int i = 0;
		/*
		System.out.println(++i); // 1, ++i -> 출력하기 전에 더해라 
		System.out.println(++i); // 2
		System.out.println(++i); // 3
		System.out.println(++i); // 4
		System.out.println(++i); // 5
		
		System.out.println(i++); // 5, i++ (후처리) -> 일단 출력해라 그리고 더해라 
		System.out.println(i++); // 6
		System.out.println(i++); // 7
		System.out.println(i++); // 8
		System.out.println(i++); // 9
		
		System.out.println(i); // 10
		*/
		while(i < 10) {
			//System.out.println(++i); // 10까지 출력
			System.out.println(i++); // 9까지 출력
		}
		
		int j = 0;
		while (true) {
			System.out.println(++j);
			if(j >= 10) {
				break;
			}
		}
		
		// 숫자 맞히기 업/다운 게임
		Scanner keyboard = new Scanner(System.in);
		double randomNumber = Math.random();
		int answer = (int) (randomNumber * 100); 
		int value = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			value = keyboard.nextInt();
			if (answer == value) {
				System.out.println("정답입니다!");
				break;
			}
			else if(answer > value) {
				System.out.println("Up!");
			}
			else {
				System.out.println("Down!");
			}
		}
		
	}

}
