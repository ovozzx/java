package _250721;

import java.util.Scanner;
import java.util.Arrays;

public class Problem135 {
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		/*
		// 백준 1330번 : 두 수 비교하기 
		System.out.println("1번");
		int a = consoleInput.nextInt();
		int b = consoleInput.nextInt();
		
		if(a < b) {
			System.out.println("<");
		}
		else if(a > b) {
			System.out.println(">");
		}
		else {
			System.out.println("==");			
		}
		
		// 백준 9498번 : 시험 성적
		System.out.println("2번");
		int score = consoleInput.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");			
		}
		
		// 백준 2753번 : 윤년
		System.out.println("3번");
		int year = consoleInput.nextInt();
		
		if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		// 백준 14681번 : 사분면 고르기
		System.out.println("4번");
		int x = consoleInput.nextInt();
		int y = consoleInput.nextInt();
		
		if((x > 0) && (y > 0)) {
			System.out.println("1");
		}
		else if((x < 0) && (y > 0)) {
			System.out.println("2");
		}
		else if((x < 0) && (y < 0)) {
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}
		
		// 백준 2884번 : 알람 시계
		System.out.println("5번");
		int hour = consoleInput.nextInt();
		int min = consoleInput.nextInt();
		
		if((min - 45) < 0) {
			hour -= 1;
			min = min + 15;
			if(hour < 0) {
				hour = 23;
			}
			
		}
		else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);
		
		// 백준 2525번 : 오븐 시계
		System.out.println("6번");
		
		int hourOven = consoleInput.nextInt(); 
		int minOven = consoleInput.nextInt();
		int time = consoleInput.nextInt();
		
		if((minOven + time) > 60) {
			hourOven = hourOven + ((minOven + time) / 60);
			minOven = (minOven + time) % 60;
		}
		else {
			minOven = minOven + time;
		}
		
		System.out.println(hourOven + " " + minOven);		
		*/
		// 백준 2480번 : 주사위 세개
		//System.out.println("7번");
		
		String numInput = consoleInput.nextLine();
		//System.out.println(numInput);
		String [] numInputArr = numInput.split(" ");
		
		int[] numInputArrInt = Arrays.stream(numInputArr)
								  .mapToInt(Integer::parseInt)
								  .toArray();
		
		//int first = Integer.parseInt(numInputArr[0]);

		int first = numInputArrInt[0];
		int second = numInputArrInt[1];
		int third = numInputArrInt[2];
		
		//System.out.println(Arrays.toString(numInputArrInt)); // 그냥 출력하면, "String 배열 객체의 메모리 주소"가 출력
		// 
		//int second = consoleInput.nextInt();
		//int third = consoleInput.nextInt();
		
		int award = 0; 
		
		if((first == second) && (second == third)) {
			award = 10000 + (first * 1000);
		}
		else if(first == second) {
			award = 1000 + (first * 100);
		}
		else if(second == third) {
			award = 1000 + (second * 100);
		}
		else if(first == third) {
			award = 1000 + (first * 100);
		}
		else {
			int max = Arrays.stream(numInputArrInt).max().getAsInt();
			award = max * 100;
		}
		System.out.println(award);
	}

}
