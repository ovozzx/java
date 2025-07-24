package practice.mission;

public class Problem24 {
	
	public static void main(String[] args) {
		
		int[] number = {2,3,4,5,6,7,8,9};
		
		for(int i : number) {
			System.out.println(i + " 단");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println("%d x %d = %d"
									.formatted(i, j, i * j));
			}
		}
		
	}

}
