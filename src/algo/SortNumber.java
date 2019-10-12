package algo;

import java.util.ArrayList;
import java.util.List;

public class SortNumber {

	public static void main(String[] args) {
		int[] a = {3, 30, 34, 5, 9};
		String answer = new SortNumber().solution(a);
		System.out.println(answer);
	}
	
	
	    public String solution(int[] numbers) {
	    	String answer = "";
	    	List<String> stringList = new ArrayList<>();

	        for (int anInt : numbers) {
	            stringList.add(String.valueOf(anInt));
	        }
	        stringList.sort(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

	        for (String s : stringList) {
	            answer += s;
	        }
	        answer = answer.charAt(0) == '0'? "0": answer;
	    	
	        return answer;
	    }
	

}
