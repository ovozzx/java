package _250721;

public class Practice1 {
	public static void main(String[] args) {
		int myAge = 13;
		int limit = 15;
		
		// 부모 동반 여부
		boolean withParent = false;
		
		if( myAge >= limit) {
			System.out.println("영화를 관람할 수 있습니다.");
		}
		//else if(withParent == true) { // 간결하게 변경할 필요 있음
		else if(withParent) {
			System.out.println("영화를 부모님과 함께 관람할 수 있습니다.");
		}
		//else if(withParent == false) {
		else if(!withParent) { // withParent가 false일 때 동작해라, 부울린은 비교 연산자가 필요 없음 
			System.out.println("부모님과 함께 오세요.");
		}
		else {
			System.out.println("영화를 관람할 수 없습니다.");
		}
	}
}
