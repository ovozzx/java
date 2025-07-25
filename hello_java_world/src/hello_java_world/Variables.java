package hello_java_world;

public class Variables {
	public static void main(String[] args) {
		/*
		 * 변수 : 계산을 위해 값을 임시로 저장하는 공간.
		 * 	- 계산?
		 * 		- 사칙연산
		 * 		- 비교연산
		 * 		- 논리연산 : AND, OR, NOT, XOR
		 * 	- 변수를 만든다
		 * 		- 공간을 만든다. (Main Board, CPU, RAM(Random Access Memory), DISK)
		 * 		- 공간에 임시 기억할 데이터를 저장한다.
		 * 	- 공학, 변수의 구체적인 정의.
		 * 		- 계산을 위해서 메모리에 임의 공간을 만들고, 해당 주소에 대한 별칭을 부여한 것.
		 * 	- 변수를 만드는 방법.
		 * 		- 저장할 값의 종류 표현 (숫자, 문자, 불린)
		 * 		- 메모리 공간에 대한 별칭 (이름)
		 * 
		 * 1 byte = 8 bit (2진수로 이루어짐 0000 0000)
		 */
		
		 /*
		 * ----------------
		 * 기본 계산
		 * ----------------
		 * */
		 int numberOne = 100;
		 int numberTwo = 40;
		 
		 int additionResult = numberOne + numberTwo; // 140
		 int subtractionResult = numberOne - numberTwo; // 60
		 int multiplicationResult = numberOne * numberTwo; // 4000
		 int divisionResult = numberOne / numberTwo; // 2.5여야하지만 실제론 2 나옴 (모두 정수 자료형이므로)
		 
		 System.out.println(additionResult);
		 System.out.println(subtractionResult);
		 System.out.println(multiplicationResult);
		 System.out.println(divisionResult);
		 
		 /*
		 * ----------------
		 * 숫자 범위 오류
		 * ----------------
		 * */
		 int numberOne_ = 1_000_000_000;
		 int numberTwo_ = 1_000_000_000;
		 
		 int additionResult_ = numberOne_ + numberTwo_; // 
		 int subtractionResult_ = numberOne_ - numberTwo_; // 
		 int multiplicationResult_ = numberOne_ * numberTwo_; // 이상한 결과가 나옴
		 int divisionResult_ = numberOne_ / numberTwo_; // 
		 
		 System.out.println(additionResult_);
		 System.out.println(subtractionResult_);
		 System.out.println("이상한 값이 나옴 : " +  multiplicationResult_);
		 System.out.println(divisionResult_);
		 
		 /*
		 * ----------------
		 * 정수 오버플로우 : int로 가능한 양수 범위 2_147_483_647 까지
		 * ----------------
		 * */
		 int numberOne__ = 2_147_483_647;
		 int numberTwo__ = 1;
		 
		 int additionResult__ = numberOne__ + numberTwo__; // 
		 int subtractionResult__ = numberOne__ - numberTwo__; // 
		 int multiplicationResult__ = numberOne__ * numberTwo__; 
		 // 이상한 결과가 나옴 (-2147483648) -> 가장 큰 숫자에서 가장 작은 숫자로 변환되는 현상! "정수 오버플로우"
		 // int로 가능한 숫자 21억 얼마, 맨앞 비트는 부호비트 
		 // 오버플로우 발생할 거 같으면 long으로 바꿔서 하기
		 int divisionResult__ = numberOne__ / numberTwo__; // 
		 
		 System.out.println("정수 오버플로우 : " + additionResult__);
		 System.out.println(subtractionResult__);
		 System.out.println(multiplicationResult__);
		 System.out.println(divisionResult__);
		 
		 /*
		 * ----------------
		 * 정수 오버플로우 해결 방법
		 * ----------------
		 * */
		 int numberOne___ = 2_147_483_647;
		 long numberTwo___ = 1;
		 // 할당하는 변수 1개라도 long이면 됨
		 // int + long => long
		 // long + int => long
		 // long + long => long
		 
		 long additionResult___ = numberOne___ + numberTwo___; // 받는 것도 long으로 수정 -> 원하는 결과 나옴
		 //int subtractionResult___ = numberOne___ - numberTwo___; // 에러 발생
		 //int multiplicationResult___ = numberOne___ * numberTwo___; 
		 //int divisionResult___ = numberOne___ / numberTwo___; // 
		 // 받는 타입과 결과의 타입이 다르면 에러 발생
		 // 큰 데서 작은 데로는 안됨 -> "명시적 형변환" 필요 
		 
		 System.out.println("정수 오버플로우 해결 후 : "+ additionResult___);
		 //System.out.println(subtractionResult___);
		 //System.out.println(multiplicationResult___);
		 //System.out.println(divisionResult___);
		 
		 /*
		 * ----------------
		 * 정수 명시적 형변환
		 * ----------------
		 * */
		 int numberOne____ = 2_147_483_647;
		 long numberTwo____ = 1;

		 int additionResult____ = (int) (numberOne____ + numberTwo____); 
		 int subtractionResult____ = (int) (numberOne____ - numberTwo____); 
		 int multiplicationResult____ = (int) (numberOne____ * numberTwo____); 
		 int divisionResult____ = (int) (numberOne____ / numberTwo____); 

		 System.out.println("명시적 형변환 후 : " + additionResult____);
		 System.out.println("명시적 형변환 후 : " + subtractionResult____);
		 System.out.println("명시적 형변환 후 : " + multiplicationResult____);
		 System.out.println("명시적 형변환 후 : " + divisionResult____);
		 // but 숫자 "정수" 변수끼리 명시적 형변환 금지! : 간디 탄생 이유
		 // 	byte, short, int, long
		 // but 숫자 "실수" 변수끼리 명시적 형변환 금지!
		 //		float, double
		 // 정수 <-> 실수 간의 명시적 형변환은 허용.
		 
		 /*
		 * ----------------
		 * 최종 수정
		 * ----------------
		 * */
		 int numberOne_____ = 2_147_483_647;
		 long numberTwo_____ = 2;

		 long additionResult_____ = numberOne_____ + numberTwo_____; 
		 long subtractionResult_____ = numberOne_____ - numberTwo_____; 
		 long multiplicationResult_____ = numberOne_____ * numberTwo_____; 
		 long divisionResult_____ = numberOne_____ / numberTwo_____; 	 
		 
		 System.out.println("에러 미발생 : " + additionResult_____);
		 System.out.println("에러 미발생 : " + subtractionResult_____);
		 System.out.println("에러 미발생 : " + multiplicationResult_____);
		 System.out.println("에러 미발생 : " + divisionResult_____);

		 /*
		 * ----------------
		 * 실수 명시적 형변환 
		 * ----------------
		 * */
		 int numberThree = 10;
		 int numberFour = 3;
		 
		 double divisionResult2 = numberThree / (double) numberFour; // 명시적 형변환
		 // 둘중 1개만 double로 바꿔주면 됨
		 // int + long => long
		 // int + double => double (8 byte) 정수보다 실수가 더 크므로 실수로 바뀜
		 System.out.println("실수 명시적 형변환 : " + divisionResult2);
		 
	}
}
