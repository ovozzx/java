package oop;

public class StudentScore { // 자료형 클래스 생성 -> public static ~ 안 씀

	// 멤버변수, 인스턴스 필드
	String name; // 멤버변수는 일반적으로 값을 할당하지 않음
	int score1;
	int score2;
	int score3;
	int score4;
	// 현재 5개의 멤버변수 (속성)
	
	/**
	 * 학생 한 명의 점수 총합을 구해 출력한다.
	 * 
	 * */
	void printSum() {
		int sum = score1 + score2 + score3 + score4;
		System.out.println(name + " 점수의 합계 : " + sum);
	}
	
	/**
	 * 학생 한 명의 점수 평균을 구해 출력한다.
	 * 
	 * */
	void printAverage() {
		int sum = score1 + score2 + score3 + score4;
		double average = sum / 4d;
		System.out.println(name + " 평균 점수 : " + average);
	}
	/**
	 * 학생의 점수 중 가장 높은 점수만 출력한다.
	 * */
	void printMaxScore() {
		int maxScore = score1;
		
		if(maxScore < score2) {
			maxScore = score2;
		}
		if(maxScore < score3) {
			maxScore = score3;		
		}	
		if(maxScore < score4) {
			maxScore = score4;
		}
		System.out.println(name + " 최고점 : " + maxScore);
	}
	/**
	 * 학생의 점수 중 가장 낮은 점수만 출력한다.
	 * */
	void printMinScore() {
		int minScore = score1;
		if(minScore > score2) {
			minScore = score2;
		}
		if(minScore > score3) {
			minScore = score3;
		}
		if(minScore > score4) {
			minScore = score4;
		}
		System.out.println(name + " 최저점 : " + minScore);
	}
	
	
}
