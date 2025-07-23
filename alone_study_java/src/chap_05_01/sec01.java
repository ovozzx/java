package chap_05_01;

public class sec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello, java");
		//int [] intarray = null ;
		//intarray[0]=10;
		String strvar1 = "이소영";
		String strvar2 = "이소영";
		
		if (strvar1 == strvar2) {
		
			System.out.println("두개는 참조 객체가 같다 "); //출력 
		}
		else {
			System.out.println("두개는 참조 객채가 다르다 ");
		}
		
		if (strvar1.equals(strvar2)) {
			System.out.println("두개는 문자열은 같음 "); //출력 
		}
		
		String strvar3 = new String("이소영");
		String strvar4 = new String("이소영");
		
		if (strvar3 == strvar4) {
			System.out.println("두개는 참조 객차게 같다 ");
		}
		else {
			System.out.println("두개는 참조 객체가 다르다 "); //출력 
		}
		
		if(strvar3.equals(strvar4)){
			System.out.println("두개는 문자열이 같음 "); //출력
		}
				
	}

}
