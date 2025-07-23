package chap_06_04;

public class method_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - return : 메소드 종료 <-> break : 조건문 종료 
		 * 
		 * */
		Car myCar = new Car() ;
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas(); //isLeftGas() 함수내 print 출력됨 !!!
		
		if(gasState) {
			System.out.println("출발합니다 ");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다 ");
		}
		else {
			System.out.println("가스를 주입하세요 ");
		}
		
		
	}

}
