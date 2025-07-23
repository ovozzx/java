package chap_05_03;

import java.util.Calendar ; //import 아예 밖에서 

public class enumeration_type_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null ; //열거 타입도 참조 객체이다! 
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일에 대한 숫자를 리턴 
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY ; //일요일 = 1
			break;
		case 2 :
			today = Week.MONDAY ;
			break;
		case 3 :
			today = Week.TUEDAY ;
			break;
		case 4 :
			today = Week.WEDNESDAY ;
			break;
		case 5 :
			today = Week.THURSDAY ;
			break;
		case 6 :
			today = Week.FRIDAY ;
			break;
		case 7 :
			today = Week.SATURDAY ;
			break;
		}
		
		System.out.println("오는 요일 : " + today);
		
		if (today == Week.MONDAY) {
			System.out.println("월요병에 걸렸습니다!");
		}
		if (week == 2) {
			System.out.println("월요병에 또 걸렸습니다!");
		}
        //왜 굳이 열거 타입을 사용하는가????

	}

}
