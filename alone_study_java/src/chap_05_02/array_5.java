package chap_05_02;

public class array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String[] array = new String[3]; //초기 배열 길이 설정 가능 -> 기본값 설정 
		System.out.println(array[0]);
		array[0] = "Java";
		array[1] = "Java";
		array[2] = new String ("Java") ;
		
		System.out.println(array[0]==array[1]); // 같은 객체 참조 => true 
		System.out.println(array[0]==array[2]); // 다른 객체 참조 => false
		System.out.println(array[0].equals(array[2])); // 문자열기준 같음 => true

	}

}
