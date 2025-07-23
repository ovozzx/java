package chap_06_04;

public class method_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - 객체 내부에서 메소드 호출 시 : 메소드 return 값을 받는 변수 타입 = 메소드 return 타입  
		 * - int는 필요 시 double로 자동 변환됨 -> 따라서 int return값은 double 변수에 넣을 수 있음 ! 
		 */
		
		Calculator_2 myCalc = new Calculator_2();
		
		myCalc.execute();
		

	}

}
