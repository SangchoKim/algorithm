package algo;
import java.util.Scanner;
import java.util.Stack;

public class Stack_10818 {

		Stack<Integer> rootStack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		String input;
		
			public void do_start() {
				while(true) {
				System.out.println("명령을 입력하세요");
				System.out.println("1.push, 2.pop, 3.size, 4.empty, 5.top");
				input = scan.nextLine();
				if(input.equals("1")) {
					System.out.println("숫자입력");
					int num = scan.nextInt();
					do_push(num);
				}else if(input.equals("2")) {
					do_pop();
				}else if(input.equals("3")) {
					do_size();
				}else if(input.equals("4")) {
					do_empty();
				}else if(input.equals("5")) {
					do_top();
				}
				}
			}
				
			// 첫째줄 
			public void do_input() {
				int n = ranNum(); // 랜덤 갯수 
				System.out.println("첫번째 명령="+ n);
			}
		
			// push
			public void do_push(int num) {
				System.out.println("스택 push=" + num);
				rootStack.push(num);
			}
		
			// pop
			public void do_pop() {
				if(!rootStack.isEmpty()) {
					System.out.println("스택상위 수="+rootStack.peek());
					rootStack.pop();
				}else {
					System.out.println("스택상위 수= -1");
				}
			}
			
			// size
			public void do_size() {
				System.out.println("스택 size=" + rootStack.size());
			}		
			
			// empty
			public void do_empty() {
				if(rootStack.isEmpty()) 
				System.out.println("스택 empty= 1");
				else System.out.println("스택 empty= 0");
			}
			
			// top
			public void do_top() {
				if(!rootStack.isEmpty()) 
				  System.out.println("스택상위 수=" + rootStack.peek());
				else System.out.println("스택상위 수= -1");
			}	
		
			// random 함수
			public int ranNum() {
				double randomValue = Math.random(); // 범위 0.0 < randomValue < 1.0
				int firstNum = (int)(randomValue * 99) + 1; // randomValue(0.5 * 5) + 1 -> int 형 변환
				return firstNum;
			}
}
