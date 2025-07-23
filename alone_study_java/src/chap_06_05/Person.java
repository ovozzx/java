package chap_06_05;

public class Person {
	final String nation = "Korea" ; //변경 불가 
	final String ssn ; // 주민 번호는 객체 생성시 초기화 ! 
	String name ; 
	
	Person(String ssn, String name){ // 생성자 
		this.ssn = ssn ;
		this.name = name ;
	}

}
