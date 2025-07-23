package chap_06_04;

public class Car {
	
	int gas ; //필드
			  //생성자
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		
		if (gas <= 0) {
			System.out.println("가스가 없습니다.");
			return false ;
		}
		
		System.out.println("가스가 있습니다.");
		return true ;
	}
	
	void run() {
		while(true) { //출력물 한번에 후다닥 나옴 
			if(gas>0) {
				System.out.println("달립니다. (가스 잔량 : " + gas + ")");
				gas -= 1 ;
			}
			else {
				System.out.println("멈춥니다. (가스 잔량 : " + gas + ")");
				return ; //void여도 return은 쓸 수 있음 -> 이때의 return은 메소드 강제 종료 역할! 
			}
		}
	}
	
	
	

}
