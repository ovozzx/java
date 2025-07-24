package com.ktdsuniversity.edu.exam;

public class Exam {
	
	// 멤버변수 = Instance field
	private long longValue;
	
	static long long Value; // static을 붙이는 순간 Class Field가 됨
	
	// 멤버 상수 = Instance Constants
	private final int grage = 1;
	
	static final int grage = 1; // static을 붙이는 순간 Class Constants가 됨
	
	// Method == Instance method
	public void print(
			final int type, /* 지역/임시 상수*/
			String msg /* argument */
	) {
		
		for (int i = 0 /* 지역/임시 변수 */ ; i < 1 ; i++) {
			
		}
		// 지역 상수
		final String name = "abc";
		// local variable
		int number = 10;
		
	}
	
	public static void add() { // static을 붙이는 순간 Class Method가 됨
		
	}

}

// 인스턴스로 접근, 인스턴스는 자기 범위를 지나면 사라짐
Exam e = new Exam();
e.longValue = 10;
e.print();

// 클래스로 접근, static은 안 사라짐 (애플리케이션이 끝나야 사라짐)
Exam.randomValue;
Exam.random();

int number = 10;
System.out.println();