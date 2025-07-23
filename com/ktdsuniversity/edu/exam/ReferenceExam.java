package com.ktdsuniversity.edu.exam;

import com.ktdsuniversity.edu.simplerpg.Character; // 패키지는 .으로 구분

/***
 * 패키지를 분리했을 때 클래스를 못 찾는 이유
 * 	- Java 언어가 다른 클래스를 찾는 기준.
 * 		- 현재 패키지에 있는 클래스만 사용할 수 있다!
 * 		- 다른 패키지에 있을 때는 명시해줘야 사용 가능
 */
public class ReferenceExam {

	public static void main(String[] args) {
		
		/**
		 * Primitive Type (by value) : 
		 * 	- 메모리에 오로지 "값"만 저장 
		 * 	- 정수, 실수, 문자, 불린
		 * 	- byte, short, long, char, boolean
		 * 	- float, double
		 * 	- char
		 *  - boolean
		 * 
		 * Reference Type (by pass|ref)
		 * 	- 메모리에 "주소"를 저장
		 * 	- Primitive Type(소문자로 시작)을 제외한 나머지 모든 타입
		 * 	- String, Scanner, Class명 (SimpleRPG, Character)
		 * 	- 배열 --> int[] aa = new int[1];
		 * 	- 왜 주소가 필요한지 : 이런 Type은 주소가 이어지므로, 인덱스를 통해 값을 알기위해 주소 필요
		 * 	- Reference에서만 '.'으로 쓸 수 있음 (this) 
		 */
		
		int a = 30; // a == 30
		System.out.println(a); // 30
		
		int b = a; // b = 30
		a = 50; // a == 50
		System.out.println(a); // 50
		System.out.println(b); // 30이 나옴
		
		int[] aa = new int[2]; // 디버깅 시 id가 나옴 : 이클립스가 관리하는 버추얼 메모리 고유 번호 (배열의 메모리 주소)
		aa[0] = 1;
		aa[1] = 2;
		
		System.out.println(aa); // [I@6b95977 -> '[' : 배열, 'I' : int 배열, '@~~~' : 해시 데이터 (변수 구분을 위한 고유값 (일종 메모리의 주소 (정확히는 아님)) 같으면 같은 메모리를 참조하고 있는 것!
		System.out.println(aa[0]);
		System.out.println(aa[1]);
		
		int[] bb = aa; // bb는 aa를 가리킴 (메모리 주소 할당) 같은 주소를 바라 봄
		bb[0] = 3; // bb가 바라보고 있는 주소 값이 바뀜, aa도 같은 주소를 바라보기 때문에 변경된 값이 같이 바뀜
		bb[1] = 4; // aa와 bb가 바라보고 있는 메모리가 같으므로, 같이 변경된다!
		System.out.println(bb); // [I@6b95977
		System.out.println(bb[0]); // 3
		System.out.println(bb[1]); // 4

		System.out.println(aa);  // [I@6b95977 : bb와 동일하게 나옴
		System.out.println(aa[0]); // 3 
		System.out.println(aa[1]); // 4
		
		//String은 왜 사용 가능한지
		Character player = new Character("플레이어1", 1, 1_000_000); // public
		//player.nickname = "플레이어1";
		//player.health = 1;
		//player.damage = 1_000_000;
		//player.isDead = false;
		
		System.out.println(player); // oop.Character @ 8bcc55f -> "oop" : 패키지 이름, 클래스 내 정보를 가져있기 때문에 메모리 주소 출력
		//System.out.println(player.nickname);
		//System.out.println(player.health);
		//System.out.println(player.damage);
		//System.out.println(player.isDead);
		player.printSatus();
		
		Character enemy = player;
		System.out.println(enemy); // 동일한 데이터 출력
		enemy.printSatus();
		//System.out.println(enemy.nickname);
		//System.out.println(enemy.health);
		//System.out.println(enemy.damage);
		//System.out.println(enemy.isDead);
		
		enemy.setNickname("빌런");
		//enemy.nickname = "빌런";
		enemy.printSatus();
		player.printSatus();
		System.out.println(player.getNickname());
		System.out.println(enemy.getNickname()); // getter를 이용해서 필요한 정보만 노출 가능
		//System.out.println(player.nickname);
		//System.out.println(enemy.nickname);
		// 자바는 포인터 등 어려운 개념을 빼고 클래스로 퉁친 것
 	}
}
