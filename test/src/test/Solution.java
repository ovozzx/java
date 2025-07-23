package test;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;


public class Solution {

	public int[] solution(int l, int r) {
        int[] answer = {};
        int[] num_arr = new int[(r-l)+1];
        int[] five_zero = new int[(r-l)+1];
        int n=0;
        
        for(int i=l;i<=r;i++){
            num_arr[n]=i;
            String num_str = String.valueOf(i);
            int flag=0;
            for(int v=0;v<num_str.length();v++){
                if(num_str.substring(v,v+1).equals("5")||num_str.substring(v,v+1).equals("0")){
                    flag=1;
                }
                else{
                    flag=0;
                }
            }
            if(flag==1){
                 five_zero[n]=i;
            }
            n++;
        }
        //List<Integer> list = Arrays.asList(five_zero);
        if(Arrays.asList(five_zero).isEmpty()){//배열에 값이 없으면
           answer = new int[] {-1};
        }
   
        Arrays.sort(five_zero);
        
        return five_zero;
    }	
	
}
