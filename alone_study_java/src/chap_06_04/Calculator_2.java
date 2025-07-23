package chap_06_04;

public class Calculator_2 {
	//객체 내부 호출 예제 
	
	int plus(int x, int y) {
		int result = x + y ;
		return result ;
	}
	
	double avg(int x, int y) {
		double result = (double)plus(x,y) /2 ;
		return result ;
	}
	
	void println(String message) { //매개변수 
		System.out.println(message);
	}
	
	void execute() {
		
		double result = avg(7,10);
		println("실행 결과 : " + result) ;
	}

}
