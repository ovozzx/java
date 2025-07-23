package chap_06_04;

public class method_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_2 mycar = new Car_2() ;
		
		mycar.keyTurnOn();
		mycar.run();
		System.out.println("현재 속도 : " + mycar.getSpeed() + "km/h");
	}

}
