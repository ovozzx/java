package hello_java_world;

public class ArtithmaticProblem2 {
	public static void main(String[] args) {
		// 문제 2 :
		/*
		* 산술 연산자를 이용해 
		* processTime을 분(Minute), 초(Second)
		* 를 구한다음 minutes, seconds 변수에 할당하고
		* 출력해보세요.
	    */

		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
		minutes = processTime / 60;
		seconds = processTime % 60;
		
		System.out.println(minutes + " 분 " + seconds + " 초" );


	}

}
