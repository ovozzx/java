package _250721;

public class ArrayExam {
	
	public static void main(String[] args) {
		
		// 일반 변수는 메모리에 랜덤하게 지정됨
		// 배열은 메모리에 연결되어 지정됨 (메모리 주소가 연결되어 있음) (ex) index 0 번 : 100, 1번 : 104, 2번 : 108 ... 
		// 자바 배열은 길이를 한번 지정하면 변경이 어려움 -> 잘 안씀
		int[] students = new int[50]; // 변수 배열을 줄 지어서 새롭게 만들어라
		students[0] = 100;
		students[1] = 200;
		students[2] = 300;
		students[3] = 100;
		students[4] = 200;
		
		int sum = students[0] + students[1] + students[2] + students[3] + students[4];
		
		// for - 범위 반복자 (몇 차례의 반복이 필요한지 정확하게 할 때 사용)
		// while - 반복자 (몇 차례의 반복이 필요한지 모를 때 사용)
		// for를 이용해서, 0부터 49까지 출력
		int studentsSum = 0;
		for (int i = 0 ; i < students.length ; i++){ // 반복 값 초기화 (0~49) ; 반복 여부 조건 ; 반복 값 증감식
			//System.out.println(i);
			//System.out.println(students[i]);
			studentsSum = studentsSum + students[i];
		}
		System.out.println(studentsSum);
		
	}

}
