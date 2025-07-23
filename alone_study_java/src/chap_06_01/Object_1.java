package chap_06_01;

public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		- 클래스(설계도) -> 인스턴스(객체) 
		- 통상, 소스 파일당 하나의 클래스를 선언, 2개 이상 선언도 가능은 함  
		- new 클래스() : 객체 생성 시킨 후, 객체의 번지를 리턴 
		- 클래스의 구성 멤버 : 
			(1) 필드
			(2) 생성자
			(3) 메소드 : 객체의 동작 담당, 객체간의 데이터를 전달하는 수단  
		*/
		Student s1 = new Student(); // 생성자 실행, 객체 1 
		System.out.println("s1 변수가 Student 객체를 참조합니다. ");
	
		Student s2 = new Student(); // 객체 2
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다. ");
	}

}
