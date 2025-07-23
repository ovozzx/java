package chap_06_03; //클래스 같은 패키지에 있으면됨 

public class Car {
	String company = "현대자동차" ;
	String model ; 
	String color ;
	int maxSpeed ;
	
	Car(){
		
	}
	
	Car(String model){
		this.model = model ;
	}
	
	Car(String model, String color){
		this.model = model ;
		this.color = color ;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model ;
		this.color = color ;
		this.maxSpeed = maxSpeed ;
	}
	
	
	
}
