package chap_06_05;

public class Singleton {
	private static Singleton singleton = new Singleton(); //자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 *생성*해 초기화, private를 붙여 변경 불가능 ! 
	private Singleton() {} ; // 생성자 new 접근 막음, 클래스 내부에선 사용 가능 
	static Singleton getInstance() { //외부에서 호출할 수 있는 정적 메소드인 getInstance를 선언하고 정적 필드에서 참조하고 있는 자신의 객체 리턴  (하나의 객체만 리턴)
		return singleton ;
	}

}
