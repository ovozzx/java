package chap_06_05;

public class Car {
	
	String model ;
	int speed ;
	
	Car(String model){//생성자 
		this.model = model ; //this : 인스턴스 필드임을 명시!
	}
	
	void setSpeed(int speed) {
		this.speed = speed ;
	}
	
	void run() {
		
		for (int i = 10 ; i<=50 ; i += 10) {
			this.setSpeed(i); // !!!!! this를 이렇게도 쓸 수 있구나 
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}
}
