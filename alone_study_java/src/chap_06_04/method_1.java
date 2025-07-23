package chap_06_04;

public class method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - 메소드 : 객체의 동작에 해당 
		 * */
		Calculator mycal = new Calculator() ;
		mycal.powerOn();
		
		int result1 = mycal.plus(5, 6) ;
		System.out.println("result1 : "+result1);
		
		byte x = 10;
		byte y = 4 ;
		double result2 = mycal.divide(x,y);// byte형은 int형으로 자동 변환됨 
		System.out.println("result2 : " + result2);
		
		mycal.powerOff();
	}

}
