package chap_06_05;

public class EarthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - 상수(불변의 값) : static final 객체마다 저장 x(클래스.상수) 여러가지 값으로 초기화하지 X 공용성 가짐 * 대문자 관례   ex) 파이 
		 * <-> final 필드 : 객체 마다 저장 (생성자 매가값을 통해 여러가지값으로 초기화), 추후 변경 불가  ex) 주민 번호  
		 * 
		 * */
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표먼적 : " + Earth.EARTH_AREA + "km^2");

	}

}
