package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumber {

	public static void main(String[] args) {
		int[] a = {3, 30, 34, 5, 9};
		String answer = new SortNumber().solution(a);
		System.out.println(answer);
	}
	
	
	    public String solution(int[] numbers) {
	    	String answer = "";
	    	
	    	for(float f :numbers) {
	    		System.out.println(f);
	    	}
	    	
	    	Arrays.sort(numbers);
	    	List<String> list = new ArrayList<String>();
	    	int max = numbers[numbers.length-1];
	    	int length = (int)(Math.log10(max)+1);
	    	for (int i = 0; i < numbers.length; i++) {
	    		int lengths = (int)(Math.log10(numbers[i])+1);
	    		String digit = " ";
	    		if(length==1) {
	    			
	    		}else if(length==2){
	    			digit = "0";
	    		}else if(length==3){
	    			digit = "00";
	    		}else if(length==4){
	    			digit = "000";
	    		}
	    		
	    		if(lengths != length) {
	    			String s = String.valueOf(numbers[i]);
	    			list.add(s+digit);
	    			
	    		}else {
	    			String s = String.valueOf(numbers[i]);
	    			list.add(s);
	    		}
			}
	    	Collections.sort(list, Collections.reverseOrder());
	    	
	    	for (int i = 0; i < numbers.length; i++) {
				if(String.valueOf(numbers[i]).equals(list.get(i))) {
					
				}
			}
	        return answer;
	    }
	

}
