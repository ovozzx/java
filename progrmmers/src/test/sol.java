package test;

import java.util.*;

public class sol {

	 public int[] solution() {
		    
		  
		    int[] arr = {5, 1, 4};
		    int[] answer = new int[Arrays.stream(arr).sum()];
	        int n = 0;
	        
	        for(int arr_num : arr){
	            
	            for(int i = 0;i<arr_num;i++){
	                answer[n+i] = arr_num;
	            }            
	            n = arr_num;
	        }

		 
		   System.out.println(answer);
		 
		 
		    /*
		 
		 
	        int answer = 0;
	        int[] arr = {1, 2, 3, 100, 99, 98};
	        int[] arr_old = new int[arr.length];
	        
	        
	        while(true){
	        arr_old = arr;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>=50 && arr[i]%2==0){
	                arr[i] = arr[i]/2;
	            }
	            else if(arr[i]<50 && arr[i]%2!=0){
	                arr[i] = arr[i]*2+1;
	            }
	            
	        }
	        
	        answer++;    
	        
	        if(Arrays.equals(arr,arr_old)){
	            break;
	        }
	       
	        }
	        */
	        return answer;
	    }
}
