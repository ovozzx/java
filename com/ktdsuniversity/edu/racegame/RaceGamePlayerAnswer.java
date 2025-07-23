package com.ktdsuniversity.edu.racegame;

public class RaceGamePlayerAnswer {

	String playerName;
	int position;
	
	void playGame() {
		System.out.println(playerName + "(위치: " + position + "), 주사위를 굴립니다.");
		
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int dice3 = (int)(Math.random() * 6) + 1;
		System.out.println("주사위1: " + dice1);
		System.out.println("주사위2: " + dice2);
		System.out.println("주사위3: " + dice3);
		
		int moveCount = dice1 + dice2 + dice3;
		System.out.println("주사위 합: " + moveCount);
		
		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println("같은 번호 보너스! X2");
			moveCount *= 2;
		}
		
		System.out.println(playerName + "(위치: " + position + ") " + moveCount + "칸 이동합니다.");
		position += moveCount;
		if (position > 100) {
			position = 100;
		}
		
		System.out.println(playerName + "의 현재 위치는 " + position + "입니다.");
		
		if (position % 17 == 0) {
			System.out.println(playerName + "이 함정에 빠졌습니다. 6칸 뒤로 이동합니다.");
			position -= 6;
			System.out.println(playerName + "의 현재 위치는 " + position + "입니다.");
		}
		
		if (position % 23 == 0) {
			System.out.println("위치 보너스! 3칸 앞으로 이동합니다.");
			position += 3;
			System.out.println(playerName + "의 현재 위치는 " + position + "입니다.");
		}
	}
	
	void resetPosition() {
		position = 1;
		System.out.println(playerName + "은 1번칸으로 이동합니다.");
	}
	
	void printPosition() {
		System.out.println(playerName + ": " + position);
	}
	
	void printWinnerMessage() {
		System.out.println(playerName + " 우승!");
	}
	
}
