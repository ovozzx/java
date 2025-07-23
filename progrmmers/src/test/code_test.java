package test;

import java.util.*;

public class code_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = new int[]{1, 2, 3}; 
		  List<Integer> num_list = new ArrayList<>();
		  num_list.add(1);
		  int stringToSearch = 2;
	      System.out.println(Arrays.asList(arr).contains(stringToSearch));
	      System.out.println(num_list.stream().mapToInt(Integer::intValue).toArray()[0]);

		
	}

}
