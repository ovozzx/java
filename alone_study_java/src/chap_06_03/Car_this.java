package chap_06_03;

public class Car_this {
	
	String company = "현대자동차" ;
	String model ; 
	String color ;
	int maxSpeed ;
	
	Car_this(){
		
	}
	
	Car_this(String model){
		this(model, "은색", 250); // 호출 끝나면 다음 코드 진행 
	}
	
	Car_this(String model, String color){
		this(model, color , 250);
	}
	
	Car_this(String model, String color, int maxSpeed){
		this.model = model ;
		this.color = color ;
		this.maxSpeed = maxSpeed ;
	}
	
	
	

}
