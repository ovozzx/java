package chap_06_03;

public class constructor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_this car1 = new Car_this() ;
		System.out.println("car1 회사 : " + car1.company) ;
		System.out.println("car1 모델 : " + car1.model) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println("car1 색깔 : " + car1.color) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println("car1 최고 속도 : " + car1.maxSpeed) ; //초기화 값 없으므로 기본값 자동 설정
		System.out.println();
		
		Car_this car2 = new Car_this("자가용") ;
		System.out.println("car2 회사 : " + car2.company) ;
		System.out.println("car2 모델 : " + car2.model) ;
		System.out.println("car2 색깔 : " + car2.color) ; 
		System.out.println("car2 최고 속도 : " + car2.maxSpeed) ; 
		System.out.println();
		
		Car_this car3 = new Car_this("자가용", "빨강") ;
		System.out.println("car3 회사 : " + car3.company) ;
		System.out.println("car3 모델 : " + car3.model) ;
		System.out.println("car3 색깔 : " + car3.color) ;
		System.out.println("car3 최고 속도 : " + car3.maxSpeed) ; 
		System.out.println();
		
		Car_this car4 = new Car_this("자가용", "빨강", 200) ;
		System.out.println("car4 회사 : " + car4.company) ;
		System.out.println("car4 모델 : " + car4.model) ;
		System.out.println("car4 색깔 : " + car4.color) ;
		System.out.println("car4 최고 속도 : " + car4.maxSpeed) ;
		System.out.println();
		
		

	}

}
