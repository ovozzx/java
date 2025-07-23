package chap_05_02;

public class array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores ;
		scores = new int[] {83,90,87}; //선언후 초기화할 경우 new 사용 
		int sum1 = 0 ;
		for (int i = 0 ; i<3 ; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		int sum2 = add(new int[] {83,90,87}); //매개변수 경우에도 마찬가지 new 사용 ! 
		System.out.println("총합 : " + sum2);
	}
	
		public static int add(int[] scores) { //main함수 밖에서 다른 함수 정의함 
			int sum2 = 0;
			for(int i = 0 ; i<3 ; i++) {
				sum2 += scores[i];
			}
			return sum2;
		}
		

	

}
