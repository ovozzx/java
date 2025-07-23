package test;

import java.util.*;

public class code_test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   	List<String> strArray = new ArrayList<String>();
	        strArray.add("1");
	        strArray.add("2");
	        strArray.add("3");
	        
	        //# 리스트 > 배열 변환 방법 
	        //방법 1
	        String[] strArray1 = strArray.toArray(new String[0]);
	        System.out.println(strArray1[0]+strArray1[1]+strArray1[2]);
	        
	        //방법 2
	        String[] strArray2 = new String[strArray.size()];
	        strArray2 = strArray.toArray(strArray2);
	        System.out.println(strArray2[0]+strArray2[1]+strArray2[2]);
	    
	        //방법 3
	        String[] strArray3 = strArray.stream().toArray(String[]::new);
	        System.out.println(strArray3[0]+strArray3[1]+strArray3[2]);
	        
	        //방법 4
	        String[] strArray4 = strArray.toArray(String[]::new);
	        System.out.println(strArray4[0]+strArray4[1]+strArray4[2]);
	        System.out.println((double)580000*0.8);
	}

}
