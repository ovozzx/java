package mission1.problem23;

public class Problem23 {
	
	public static void main(String[] args) {
		
		int[] number = {2, 3};
		
		for(int i : number) {
			System.out.println(i + " 단");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println("%d x %d = %d"
									.formatted(i, j, i * j));
			}
		}
		
	}

}
