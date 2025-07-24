package practice.mission;

import java.util.Scanner;

public class Problem20 {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print(">");
		int enemyHealthPoint  = consoleInput.nextInt();
		
		while(true) {
			enemyHealthPoint -= (int) (Math.random() * 100);
			System.out.println(" enemy Health Point : " + enemyHealthPoint);
			if(enemyHealthPoint <= 0) {
				System.out.print("Victory!");
				break;
			}
		}
	}

}
