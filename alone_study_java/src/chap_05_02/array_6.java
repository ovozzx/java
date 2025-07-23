package chap_05_02;

public class array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"java", "array", "copy"};
		String[] new_array = new String[5];
		
		System.arraycopy(array, 0, new_array, 0, array.length); // 원본 배열, 원본 배열 시작 인덱스, 새 배열, 새 배열 시작 인덱스, 원본에서 복사할 길
		
		for(int i=0 ; i<new_array.length ; i++) {
			System.out.print(new_array[i]+" "); //자바는 들여쓰기 필수 아님. 개행문자 없는 출력함수. 안채워진 것은 기본값으로 채워짐 
		}
	}

}
