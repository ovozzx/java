package com.ktdsuniversity.edu.students;


/** document
 * <pre>
 * 학생 한 명의 점수를 구하는 코드
 * 여러 점수들의 합계를 구한다.
 * 여러 점수들의 총 평균을 구한다.
 * 여러 점수들 중에 가장 고점 점수를 구한다.
 * 여러 점수들 중에 가장 최저점 점수를 구한다.
 * </pre>
 */
public class Scores {
	
	public static void main(String[] args) {
		
		//int[] a = new int[5];
		
		StudentScore student1 = new StudentScore(); // 메모리에 줄 지어서 만듦 (new)
		// 디버깅 시, 내용 펼칠 수 있음
		student1.name = "학생1";
		student1.score1 = 100;
		student1.score2 = 90;
		student1.score3 = 80;
		student1.score4 = 99;
		
		// 점수의 합계
	    /*
		int sum = student1.score1 + student1.score2 + student1.score3 + student1.score4;
		System.out.println(student1.name + "점수의 합계 : " + sum);
		*/
		
		// 점수의 합계
		student1.printSum(); // 호출 (실행해라)
		
		// 평균 점수
		student1.printAverage();
		
		// 최고점 점수
		student1.printMaxScore();
		
		// 최저점 점수
		student1.printMinScore();
		
		
		StudentScore soYeong = new StudentScore();
		
		soYeong.name = "soyeong";
		soYeong.score1 = 100;
		soYeong.score2 = 95;
		soYeong.score3 = 100;
		soYeong.score4 = 99;
		
		soYeong.printSum();
		soYeong.printAverage();
		soYeong.printMaxScore();
		soYeong.printMinScore();
		
		
		
		
		
/*		
		// 점수의 평균.
		double average = sum / 4d;
		System.out.println(student1.name + "평균 점수 : " + average);
		
		// 최고점 점수.
		int maxScore = student1.score1;
		if (maxScore < student1.score2) { 
			maxScore = student1.score2;
		}
		if (maxScore < student1.score3){ // else if noo
			maxScore = student1.score3;
		}
		if (maxScore < student1.score4) {
			maxScore = student1.score4;
		}
		System.out.println(student1.name + "최고점 : " + maxScore);
		
		// 최저점 점수.
		int minScore = student1.score1;
		if (minScore > student1.score2) {
			minScore = student1.score2;
		}
		if (minScore > student1.score3) {
			minScore = student1.score3;
		}
		if (minScore > student1.score4) {
			minScore = student1.score4;
		}
		System.out.println(student1.name + "최저점 : " + minScore);		
		
		
		StudentScore soyeong = new StudentScore();
		soyeong.name = "이소영";
		soyeong.score1 = 80;
		soyeong.score2 = 80;
		soyeong.score3 = 80;
		soyeong.score4 = 80;

		// 점수의 합계
		int soyeongSum = soyeong.score1 + soyeong.score2 + soyeong.score3 + soyeong.score4;
		System.out.println(soyeong.name + "점수의 합계 : " + sum);
		
		// 점수의 평균.
		double soyeongAverage = soyeongSum / 4d;
		System.out.println(soyeong.name + "평균 점수 : " + soyeongAverage);
		
		// 최고점 점수.
		int soyeongMaxScore = soyeong.score1;
		if (soyeongMaxScore < soyeong.score2) { 
			soyeongMaxScore = soyeong.score2;
		}
		if (soyeongMaxScore < soyeong.score3){ // else if noo
			soyeongMaxScore = soyeong.score3;
		}
		if (soyeongMaxScore < soyeong.score4) {
			soyeongMaxScore = soyeong.score4;
		}
		System.out.println(soyeong.name + "최고점 : " + soyeongMaxScore);
		
		// 최저점 점수.
		int soyeongMinScore = soyeong.score1;
		if (soyeongMinScore > soyeong.score2) {
			soyeongMinScore = soyeong.score2;
		}
		if (soyeongMinScore > soyeong.score3) {
			soyeongMinScore = soyeong.score3;
		}
		if (soyeongMinScore > soyeong.score4) {
			soyeongMinScore = soyeong.score4;
		}
		System.out.println(soyeong.name + "최저점 : " + soyeongMinScore);		
		
		
		/*
		 * 클래스 사용 없이 진행할 때 -> 이를 개선하기 위해 클래스 사용
		 * 
		 * 
		String name = "학생1";
		int score1 = 100;
		int score2 = 90;
		int score3 = 80;
		int score4 = 99;
		
		// 점수의 합계.
		int sum = score1 + score2 + score3 + score4;
		System.out.println(name + "점수의 합계 : " + sum);
		
		// 점수의 평균.
		double average = sum / 4d;
		System.out.println(name + "평균 점수 : " + average);
		
		// 최고점 점수.
		int maxScore = score1;
		if (maxScore < score2) { 
			maxScore = score2;
		}
		if (maxScore < score3){ // else if noo
			maxScore = score3;
		}
		if (maxScore < score4) {
			maxScore = score4;
		}
		System.out.println(name + "최고점 : " + maxScore);
		
		// 최저점 점수.
		int minScore = score1;
		if (minScore > score2) {
			minScore = score2;
		}
		if (minScore > score3) {
			minScore = score3;
		}
		if (minScore > score4) {
			minScore = score4;
		}
		System.out.println(name + "최저점 : " + minScore);
		
		// 다른 학생 추가
		String name2 = "학생2";
		int score21 = 100;
		int score22 = 90;
		int score23 = 80;
		int score24 = 99;
		
		// 점수의 합계.
		int sum2 = score21 + score22 + score23 + score24;
		System.out.println(name2 + "점수의 합계 : " + sum2);
		
		// 점수의 평균.
		double average2 = sum2 / 4d;
		System.out.println(name2 + "평균 점수 : " + average2);
		
		// 최고점 점수.
		int maxScore2 = score21;
		if (maxScore2 < score22) { 
			maxScore2 = score22;
		}
		if (maxScore2 < score23){ // else if noo
			maxScore2 = score23;
		}
		if (maxScore2 < score24) {
			maxScore2 = score24;
		}
		System.out.println(name + "최고점 : " + maxScore);
		
		// 최저점 점수.
		int minScore2 = score21;
		if (minScore2 > score22) {
			minScore2 = score22;
		}
		if (minScore2 > score23) {
			minScore2 = score23;
		}
		if (minScore2 > score24) {
			minScore2 = score24;
		}
		System.out.println(name2 + "최저점 : " + minScore2);
		*/
		
	
	}
	

}
