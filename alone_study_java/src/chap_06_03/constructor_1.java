package chap_06_03;

public class constructor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - new 연산자로 생성자 실행 -> Car myCar = new Car() ; 
		 * - 클래스에 생성자가 명시적으로 선언되어 있을 경우, 선언된 생성자를 호출해야 함(매개변수 맞춰서)
		 * - 필드 초기화 방법 : (1) 필드 선언시 초기화 (2) 생성자에 초기값 주기  
		 * - this : 객체 자신의 참
		 * - 생성자 오버로딩 : 매개 변수를 달리하는 생성자를 여러 개 선언 
		 * - this() : 자신의 다른 생성자를 호출하는 코드(중복 코드 방지), 생성자의 첫 줄에서만 허용, 호출되는 생성자의 매개 변수에 맞게 제공해야 함 
		 * */
		//company / model color maxspeed
		Car car1 = new Car() ;
		System.out.println("car1 회사 : " + car1.company) ;
		System.out.println("car1 모델 : " + car1.model) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println("car1 색깔 : " + car1.color) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println("car1 최고 속도 : " + car1.maxSpeed) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println();
		
		Car car2 = new Car("자가용") ;
		System.out.println("car2 회사 : " + car2.company) ;
		System.out.println("car2 모델 : " + car2.model) ;
		System.out.println("car2 색깔 : " + car2.color) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println("car2 최고 속도 : " + car2.maxSpeed) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강") ;
		System.out.println("car3 회사 : " + car3.company) ;
		System.out.println("car3 모델 : " + car3.model) ;
		System.out.println("car3 색깔 : " + car3.color) ;
		System.out.println("car3 최고 속도 : " + car3.maxSpeed) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println();
		
		Car car4 = new Car("자가용", "빨강", 200) ;
		System.out.println("car4 회사 : " + car4.company) ;
		System.out.println("car4 모델 : " + car4.model) ;
		System.out.println("car4 색깔 : " + car4.color) ;
		System.out.println("car4 최고 속도 : " + car4.maxSpeed) ;
		System.out.println();
		
		
		
	}

}
