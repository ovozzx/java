package chap_05_02;

public class array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87} ; //배열은 선언시 초기화 or 나중에 new 사용하여 초기화 
		
		System.out.println("scores[0] :" + scores[0]);
		System.out.println("scores[1] :" + scores[1]);
		System.out.println("scores[2] :" + scores[2]);
		
		int sum = 0;
				
		for(int i = 0 ; i<3 ; i++) {
			sum += scores[i];
			
		}
		
		System.out.println("총합 :" + sum);
		double avg = (double)sum/3 ; //실수 나눗셈시 (double)로 강제변환함, 안하면 소수점 뒤에 잘리고 .0으로 됨 
		System.out.println("평균 : " + avg);
		

	}

}

