package chap_06_05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - final 필드 : 초기값 저장되면 이것이 최종값이 되어서 프로그램 실행 도중에 수정할 수 없음 
		 * - final 필드 초기값 : 1) 필드 선언 시 줌 2) 생성자 (객체 생성 시 외부 데이터로 초기화) 
		 * - 초기화 안하도 남겨두면 컴파일 에러 발생 
		 * */
		Person p1 = new Person("123-123", "홍길동");
		
		System.out.println(p1.nation); // 변경 불가 
	    System.out.println(p1.ssn); // 변경 불가 
	    System.out.println(p1.name); // 변경 가능 
	    
	    //p1.nation = "usa"; -> 에러
	    //p1.ssn = "2222-222"; -> 에러
	    p1.name = "이소영";
	    System.out.println(p1.name); // 변경 가능
	    
		
	}

}