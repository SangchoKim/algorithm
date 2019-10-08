package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchString {

	public static void main(String[] args) {
		
		System.out.println(new SearchString().search("HORSE", "HORSS"));
		System.out.println(new SearchString().search("WAS", "ASW"));
		System.out.println(new SearchString().search("ABCEDF", "CEDABF"));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean search(String word, String target) {
		boolean answer = false;
		List w = Arrays.asList(word.split(""));
		List t = Arrays.asList(target.split(""));
		Collections.sort(w);
		Collections.sort(t);
		
		if(w.size()!=t.size()) {
			return answer;
		}
		
		for (int i = 0; i < w.size(); i++) {
			if(!w.get(i).equals(t.get(i))) {
				return answer;
			}	
		}
		answer = true;
		
		return answer;
	}

}
