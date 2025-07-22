package _250721;

import java.util.Scanner;

public class WordRelayGame {
	public static void main(String[] args) {
		
		System.out.println("끝말잇기 게임!");
		// (1) 마지막 글자 가져오기, (2) 시작하는 문자 확인
		Scanner consoleInput = new Scanner(System.in);
		String word = "";
		char lastLetter = ' '; // 한글자만 생성
		// word.charAt(lastIndex); // 해당 인덱스 한글자만 가져오기
		
		while(true) {
			word = consoleInput.next(); // 입력 반복으로 받음
			System.out.println(word);
			//if(word.charAt(word.length() -1).equals(lastLetter)) {
			//}
			// 이전에 입력했던 단어의 마지막 글자로 word가 시작되는지 확인
			// 시작하지 않는다면, 게임 종료
			if (lastLetter != ' ' && !word.startsWith(lastLetter + "")) { // 첫번째(시작) 단어는 제외해야 함
				// string 명시적 형변환 필요 : String.valueOf or + "" (문자 더하기)
				//anything + string => string (string은 매우 큼)
				// 1 + "1" => "11"
				break; // while 종료 
			}
			
			
			int wordLength = word.length();
			System.out.println(wordLength);
			
			int lastIndex = wordLength - 1;
			
					
			System.out.println(lastIndex);
			System.out.println(lastLetter);
			
			
		}
		
	}

}
