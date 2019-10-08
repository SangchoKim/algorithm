package algo;

import java.util.Arrays;
import java.util.Stack;

public class SearchWord {

	public static void main(String[] args) {
		String s = "baabaa";
		String[] word = s.split("");
		
		Stack stack = new Stack();
		
		for (int i = 0; i < word.length; i++) {
			
			if(!stack.empty()&&stack.peek().equals(word[i])) {
				stack.pop();
			}else {
				stack.push(word[i]);
			}
			
		}
		
		
		
		if(stack.empty()) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
}
