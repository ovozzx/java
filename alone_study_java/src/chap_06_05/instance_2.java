package chap_06_05;

public class instance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* - 정적 멤버 : 선언 앞에 static만 붙이면 됨 
		 * - 정적 멤버(필드&메소드)는 메소드 영역에서 관리 -> 객체 없어도 실행 가능 ! (따라서 정적 메소드 내부에 인스턴스 멤버 & this(인스턴스 필드) 사용 불가능!) 
		 * - 정적 메소드에서 인스턴스 멤버를 사용하고 싶다면, 객체 먼저 생성하고 참조변수 접
		 * - 정적 메소드 : 인스턴스 필드를 포함하지 않을 때 정적 메소드로 ! (포함한다면 인스턴스 메소드로 사용)  
		 * - 클래스.필드 & 클래스.메소드() 
		 * - 외부에서 주어진 매개값들을 가지고 수행 시 -> 정적 메소드 
		 */
		double result1 = 10*10*Calculator.pi ;
		int result2 = Calculator.plus(10,5) ;
		int result3 = Calculator.minus(10,5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		

	}

}
