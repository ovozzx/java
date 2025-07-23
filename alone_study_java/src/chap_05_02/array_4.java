package chap_05_02;

public class array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87} ;
		System.out.println("배열 길이 : "+scores.length);
		int sum = 0;
		for(int i = 0; i<scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum/scores.length ;
		System.out.println("평균 : " + avg);

	}

}
