package hello_java_world;

public class ArtithmaticProblem3 {
	public static void main(String[] args) {
		// 문제 3 :
		/*
		* 섭씨온도를 나타내는 celsius 변수와
		* 화씨온도를 나타내는 fahrenheit 변수가 있습니다.
		* celsius 변수에는 30 이 할당되어 있습니다.
		* 섭씨 30도를 화씨온도로 변경하면
		* 화씨 86도가 됩니다.
		* 섭씨온도를 화씨온도로 변경해 
		* fahrenheit 변수에 할당하고 출력해보세요.
		* 변경공식: (섭씨 × 9/5) + 32 = 화씨
		*/

		int celsius = 30; // 섭씨
		int fahrenheit = 0; // 화씨
		fahrenheit = (celsius * 9/5) + 32;
		System.out.println("화씨 변환 결과 : " + fahrenheit);
		
	}
}
