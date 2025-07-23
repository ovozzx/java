package chap_06_04;

public class Calculator_3 {
	
	double areaRectangle(double width) { //정사각형 넓이 
		return width * width ;
	}

	double areaRectangle(double width, double height) { //직사각형 넓이 -> 오버로딩 
		return width * height ;
	}	
	
}
