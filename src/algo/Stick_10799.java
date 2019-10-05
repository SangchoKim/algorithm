package algo;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Stick_10799 {

	// ( -> push 
		// () -> ( 수만큼 추가
		// ) -> pop -> +1 추가
		public void do_start() throws IOException {
			System.out.println("명령을 입력하세요");
		    Scanner scan = new Scanner(System.in);
		    String input = scan.nextLine();
		    
		    Stack<Character> stack = new Stack<>();    
		    int number = 0;
		    
		    for(int i=0 ; i<input.length() ; i++){
		        if(input.charAt(i)=='(' && input.charAt(i+1)==')'){
		            number += stack.size();
		            ++i;
		        }
		        else if(input.charAt(i)==')'){
		            stack.pop();
		            ++number;
		        }
		        else{
		            stack.push(input.charAt(i));
		        }
		    }
		    
		    System.out.println(number);
		}
}
