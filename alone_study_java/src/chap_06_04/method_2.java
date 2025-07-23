package chap_06_04;

public class method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - 매개 변수를 모를 경우 : (1) 배열 타입으로 선언 (2) ... 사용 (자동 배열 생성) 
		 */
		
		Computer myCom = new Computer() ; 
		
		int[] values1 = {1,2,3} ;
		int result1 = myCom.sum1(values1) ; //이렇게 배열 초기화후 매개변수로 집어넣기 가능 
		System.out.println("sum1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); //매개변수 초기화로도 가능 
		System.out.println("sum2 : " + result2) ;
		
		int result3 = myCom.sum2(1,2,3); //... 매개변수 사용할 경우 
		System.out.println("sum3 : " + result3);
		 
		int result4 = myCom.sum2(1,2,3,4,5); //... 매개변수 사용할 경우 
		System.out.println("sum4 : " + result4);
		
	}

}
