package chap_06_05;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 싱글톤 * 단 하나의 객체만 만들도록 보장되어야하는 객체 -> 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 생성자 앞에 private 접근 제한자를 붙여줌 (new 연산자만큼 객체가 생성되므로)  
		 * 클래스 내부에서는 new 연산자로 생성자 호출 가능 !
		 * 외부에서 싱글톤 객체를 얻는 유일 방법은 getInstance() 메소드를 호출하는 방법뿐 -> 단 하나의 객체만 리턴 
		 * */
		
		Singleton obj1 = Singleton.getInstance(); //동일 객체 참조 
		Singleton obj2 = Singleton.getInstance(); //동일 객체 참조 
		
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		}
		else {
			System.out.println("다른 객체");
		}

	}

}
