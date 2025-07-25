package com.ktdsuniversity.edu.racegame;

public class RaceGame { // 문제 2개 약 2시간 소요
	public static void main(String[] args) {
		
		/**
		 * 개선 포인트 : 플레이어 수 3명보다 많을 때, 
		 * 동일 위치 움직일때마다 확안 -> 클래스 내 동작에서 확인해야하는데 다른 객체 거 어떻게 가져오지
		 * 반복 줄이기
		 * 끝나는 시점
		 */
		Player[] players = new Player[10];
		
		players[0] = new Player();
		players[0].Number = 1;
		players[0].location = 1;
		
		players[1] = new Player();
		players[1].Number = 2;
		players[1].location = 1;
		
		players[2] = new Player();
		players[2].Number = 3;
		players[2].location = 1;
		
		while(players[0].location < 100
				&& players[1].location < 100
				&& players[2].location < 100) {
			

			System.out.println("===============");
			
			// 1번 플레이어
			players[0].location = players[0].dicePlay();
			
			if(players[0].location == players[1].location) {
				// 같은 위치 -> 먼저 도착 (주사위 던질 때마다 확인)
				players[1].location = 1;
				System.out.println("플레이어2와 같은 위치입니다.");
				System.out.println("플레이어2가 1번칸으로 이동합니다.");
			}
			if(players[0].location == players[2].location) {
				// 같은 위치 -> 먼저 도착 (주사위 던질 때마다 확인)
				players[2].location = 1;
				System.out.println("플레이어3과 같은 위치입니다.");
				System.out.println("플레이어3이 1번칸으로 이동합니다.");				
			}

			if( players[0].location >= 100 
					|| players[1].location >= 100 
					|| players[2].location >= 100 ) {
				break;
			}
			
			System.out.println("-------------------");
			System.out.println(" 플레이어" + players[0].Number + ": " + players[0].location);
			System.out.println(" 플레이어" + players[1].Number + ": " + players[1].location);
			System.out.println(" 플레이어" + players[2].Number + ": " + players[2].location);
			System.out.println("-------------------");
			
			// 2번 플레이어
			players[1].location = players[1].dicePlay();
			
			if(players[1].location == players[0].location) {
				// 같은 위치 -> 먼저 도착 (주사위 던질 때마다 확인)
				players[0].location = 1;
				System.out.println("플레이어1과 같은 위치입니다.");
				System.out.println("플레이어1이 1번칸으로 이동합니다.");
			}
			if(players[1].location == players[2].location) {
				// 같은 위치 -> 먼저 도착 (주사위 던질 때마다 확인)
				players[2].location = 1;
				System.out.println("플레이어3과 같은 위치입니다.");
				System.out.println("플레이어3이 1번칸으로 이동합니다.");				
			}

			if( players[0].location >= 100 
					|| players[1].location >= 100 
					|| players[2].location >= 100 ) {
				break;
			}
			
			System.out.println("-------------------");
			System.out.println(" 플레이어" + players[0].Number + ": " + players[0].location);
			System.out.println(" 플레이어" + players[1].Number + ": " + players[1].location);
			System.out.println(" 플레이어" + players[2].Number + ": " + players[2].location);
			System.out.println("-------------------");
			
			// 3번 플레이어
			players[2].location = players[2].dicePlay();
			
			if(players[2].location == players[0].location) {
				// 같은 위치 -> 먼저 도착 (주사위 던질 때마다 확인)
				players[0].location = 1;
				System.out.println("플레이어1과 같은 위치입니다.");
				System.out.println("플레이어1이 1번칸으로 이동합니다.");
			}
			if(players[2].location == players[1].location) {
				// 같은 위치 -> 먼저 도착 (주사위 던질 때마다 확인)
				players[1].location = 1;
				System.out.println("플레이어2와 같은 위치입니다.");
				System.out.println("플레이어2가 1번칸으로 이동합니다.");				
			}
			
			if( players[0].location >= 100 
					|| players[1].location >= 100 
					|| players[2].location >= 100 ) {
				break;
			}
			
			System.out.println("-------------------");
			System.out.println(" 플레이어" + players[0].Number + ": " + players[0].location);
			System.out.println(" 플레이어" + players[1].Number + ": " + players[1].location);
			System.out.println(" 플레이어" + players[2].Number + ": " + players[2].location);
			System.out.println("-------------------");			
			

			
		}
	}
}
