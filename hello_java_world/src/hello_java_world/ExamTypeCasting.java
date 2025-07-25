package hello_java_world;

public class ExamTypeCasting {
	public static void main(String[] args) {
		// 프로젝트 명 규칙 : **소문자**로 구성, 단어와 단어는 '_'로 구분
		// 클래스 명 규칙 : **대/소문자**로 구성, 첫 글자와 각 단어의 첫 글자는 모두 대문자로 구성, 나머지는 소문자로 구성
		// 				 특수기호 사용 불가.
		// 변수 명 규칙 : 대/소문자로 구성, 첫 글자는 **소문자**, 다음에 나오는 각 단어들의 첫 글자는 모두 대문자로 구성.
		//             특수기호 사용 불가 ('_'는 되지만 잘 안씀)
		
		// 문제 : 
		// 점수를 기록할 수 있는 변수 4개를 만들고, 임의의 값을 할당.
		// 각 점수의 합계를 할당할 수 있는 변수 1개를 만들고 점수 변수 4개의 합을 할당.
		// 평균 점수를 할당할 수 있는 변수 1개를 만들고, 평균 점수를 구해 할당. ("실수"로 표현되어야 한다.)
		
		System.out.println("평균 계산기");
		// 점수는 모두 정수인가?
		int scoreOne = 100;
		int scoreTwo = 90;
		int scoreThree = 80;
		int scoreFour = 70;
		
		int sumNumber = scoreOne + scoreTwo + scoreThree + scoreFour;
		float avgNumber = (float) sumNumber / 4;
		// 다른 방법 
		// double avgNumber = sumNumber / 4.0;
		// double avgNumber = sumNumber / 4d;
		// double avgNumber = sumNumber / (4 * 1.0);
		
		System.out.println("합 : " + sumNumber);
		System.out.println("평균 : " + avgNumber);
		
		/*
		 * -------------
		 * 디버깅 : 버그가 발생하면 원인을 찾기위해 하는 활동 
		 * 왼쪽 라인 숫자 더블 클릭 -> 디버깅 브레이크 포인트
		 * 단축키 : F11 or command + f11
		 * 포인트 설정 -> f11 -> 실행하고 f6 누르면 한줄씩 실행됨
		 * 초록색 하이라이트 : 다음에 실행될 라인
		 * 완료 후, 오른쪽 위 퍼스펙티브 변경 (벌레 옆에)
		 * -------------
		 */
	}

}
