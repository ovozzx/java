package chap_06_05;

public class instance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - (1) 인스턴스 멤버 : 객체마다 가지고있는 멤버 (객체 생성해야 사용 가능)
		 * 		 * 인스턴스 메소드 : 블록 내부에서 인스턴스 필드가 사용되는 경우, 객체 내부가 아니라 메소드 영역에서 공유됨 
		 * - (2) 정적 멤버 : 객체들이 공유하는 멤버 (객체 생성 안해도 사용 가능) ex) 파이
		 * - this : 생성자 or 매개변수의 이름이 필드와 동일한 경우 사용 (인스턴스 멤버인 필드를 명시!!!) 
		 * - main() 메소드도 정적 메소드이기 때문에, 인스턴스 필드 & 메소드를 바로 사용할 수 없음 ! 
		 * */
		
		Car mycal = new Car("포르쉐"); //생성자로 model 초기화 
		Car yourcal = new Car("벤츠");
		
		mycal.run();
		yourcal.run();
		
	}

}
