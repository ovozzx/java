package com.ktdsuniversity.edu.racegame;

public class RaceGameAnswer {

	public static void main(String[] args) {
		
		RaceGamePlayerAnswer[] players = new RaceGamePlayerAnswer[10];
		for (int i = 0; i < players.length; i++) {
			players[i] = new RaceGamePlayerAnswer();
			players[i].playerName = "플레이어" + (i + 1);
			players[i].position = 1;
		}
		
		int goalPosition = 100;
		// 플레이어 턴
		int nowTurn = 0; 
		while (true) {
			// 플레이어 주사위 굴림.
			players[nowTurn].playGame();
			
			// 겹치는 플레이어 1번칸으로 이동.
			for (int i = 0; i < players.length; i++) {
				if (i != nowTurn && players[nowTurn].position == players[i].position) {
					System.out.println(players[i].playerName + "과 같은 위치입니다.");
					players[i].resetPosition();
					break;
				}
			}
			
			// 모든 플레이어 위치 출력.
			System.out.println("-".repeat(30));
			for (int i = 0; i < players.length; i++) {
				players[i].printPosition();
			}
			System.out.println("-".repeat(30));
			
			// 현재 플레이어가 목적지에 도착했는지 판단.
			if (players[nowTurn].position == goalPosition) {
				players[nowTurn].printWinnerMessage();
				// 게임 종료
				break;
			}
			
			// 다음턴으로 넘김.
			nowTurn++;
			// 마지막 플레이어였다면, 첫번째 플레이어로 턴 넘김.
			if (nowTurn >= players.length) {
				nowTurn = 0;
			}
		}
		
		System.out.println("게임을 종료합니다.");
		
	}
	
}
