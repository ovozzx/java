package chap_05_02;

public class array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,71,84,93,87} ;
		int sum = 0;
		for(int score : scores) {
			sum += score ;
		}
		double avg = (double) sum/scores.length;
		System.out.print("평균 : " + avg);
	}

}
