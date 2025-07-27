package mission1.problem25;

public class Problem25 {
	
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 1000 ; i++) {
			
			if(i == 1) {
				continue;
			}
			
			int cnt = 0;
			
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			
			if(cnt == 0) {
				System.out.println(i);
			}
		}
		
	}

}
