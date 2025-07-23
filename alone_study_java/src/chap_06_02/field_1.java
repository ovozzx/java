package chap_06_02;

public class field_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * - 필드(클래스 멤버 변수) : 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터를 저장하는 곳
 * - 클래스 외부에서 필드 사용할 경우, 클래스로부터 객체 생성한 뒤 필드 사용해야 함 
 */
	Car myCar = new Car() ;
	
	System.out.println("제작 회사 : " + myCar.company);
	System.out.println("모델명 : " + myCar.model);
	System.out.println("색깔 : " + myCar.color);
	System.out.println("최고속도 : " + myCar.maxSpeed);
	System.out.println("현재속도 : " + myCar.speed);
	
	myCar.speed = 60 ;
	System.out.println("수정된 속도 : " + myCar.speed);
		
	}

}
