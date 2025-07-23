package chap_06_04;

public class method_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - 메소드 오버로딩 조건 : 매개 변수의 타입/개수/순서 중 1개가 달라야 함 ! (ex. 메소드의 return 타입만 다른 것은 오버로딩 아님! )
		 * - 오버로딩된 메소드를 호출할 경우, JVM은 매개 변수의 타입을 보고 메소드 선택 -> 매개 변수 타입이 일치하지 않을 경우 자동 타입 변환 가능한지 검사함 (ex) int -> double 
		 * 
		 * */
		
		Calculator_3 myCal = new Calculator_3() ;
		
		double result1 = myCal.areaRectangle(10);
		double result2 = myCal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
	}

}
