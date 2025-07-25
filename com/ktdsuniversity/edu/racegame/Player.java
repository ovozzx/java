package com.ktdsuniversity.edu.racegame;

public class Player {
	int Number;
	int diceNumber1;
	int diceNumber2;
	int diceNumber3;
	int location;
	
	int dicePlay() {
		
		System.out.println("플레이어" + Number + "(위치 " 
		+ location + ") 턴, " + "주사위를 굴립니다.");
		
		/**
		 * Math.random()은 0.0 이상 1.0 미만의 double 값을 반환합니다.
		 * */
		diceNumber1 = (int) (Math.random() * 6) + 1;
		System.out.println("주사위1 : " + diceNumber1);
		diceNumber2 = (int) (Math.random() * 6) + 1;
		System.out.println("주사위2 : " + diceNumber2);
		diceNumber3 = (int) (Math.random() * 6) + 1;
		System.out.println("주사위3 : " + diceNumber3);
		int diceNumberSum = diceNumber1 + diceNumber2 + diceNumber3;
		System.out.println("주사위 합 : " + diceNumberSum);
		

		if(!(diceNumber1 == diceNumber2
		   && diceNumber2 == diceNumber3)) { // 하나라도 다른 경우
			
			System.out.println("플레이어" + Number + "(위치 " 
					+ location + ") " + diceNumberSum + " 칸 이동합니다.");
			location += diceNumberSum;
			
		}
		else { // 모두 같은 경우
			
			System.out.println("같은 번호 보너스! X2");
			System.out.println("플레이어" + Number + "(위치 " 
					+ location + ") " + (diceNumberSum * 2) + " 칸 이동합니다.");
			location += (diceNumberSum * 2); // 합의 배수?
		}
		//location += diceNumber;
		System.out.println("플레이어" + Number + "의 현재 위치는 " 
				+ location + "입니다.");
		
		if(diceNumberSum == 9
				&& location == 1
			   ) {
				location = 10;
			}
		if(location % 17 == 0) {
			location -= 6;
			System.out.println("플레이어" + Number + "이 함정에 빠졌습니다. 6칸 뒤로 이동합니다.");
			System.out.println("플레이어" + Number + "의 현재 위치는 " 
					+ location + "입니다.");
		}
		if(location % 23 == 0) {
			location += 3;
			System.out.println("위치 보너스! 3칸 앞으로 이동합니다.");
			System.out.println("플레이어" + Number + "의 현재 위치는 " 
					+ location + "입니다.");
		}
		
		if(location >= 100) {
			System.out.println("-------------------");
			System.out.println("플레이어" + Number + " 우승!");
			System.out.println("게임을 종료합니다.");
			return location;
		}
		
		return location;
	}
}
