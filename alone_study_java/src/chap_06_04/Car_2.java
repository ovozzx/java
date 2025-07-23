package chap_06_04;

public class Car_2 {
	/*
	 * - 객체 외부에서 호
	 * */
	
	int speed ;
	
	// 생성자

	int getSpeed() {
	
		return speed ;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10 ; i <= 50 ; i+=10) {
			speed = i ;//this.speed = i ; .. 그냥 필드 이름 불러와서 쓸 수 있음 .. this는 주로 생성자에서 필드명 = 매개변수명일 때 사용! 
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}
	

}
