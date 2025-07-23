package chap_06_04;

public class Calculator {
	
	void powerOn() {
		System.out.println("전원을 켭니다") ;
	}
	
	int plus(int x, int y) {
		int result = x+y ;
		return result ;
	}
	
	double divide(int x, int y) { //매개변수에 double형 들어올 경우 컴파일 에러 발생! 
		double result = (double)x/(double)y ;
		return result ;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다") ;
	}
	
	
	
	
}
