package algo;
import java.util.Scanner;
import java.util.Stack;

public class Stack_10818 {

		Stack<Integer> rootStack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		String input;
		
			public void do_start() {
				while(true) {
				System.out.println("����� �Է��ϼ���");
				System.out.println("1.push, 2.pop, 3.size, 4.empty, 5.top");
				input = scan.nextLine();
				if(input.equals("1")) {
					System.out.println("�����Է�");
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
				
			// ù°�� 
			public void do_input() {
				int n = ranNum(); // ���� ���� 
				System.out.println("ù��° ���="+ n);
			}
		
			// push
			public void do_push(int num) {
				System.out.println("���� push=" + num);
				rootStack.push(num);
			}
		
			// pop
			public void do_pop() {
				if(!rootStack.isEmpty()) {
					System.out.println("���û��� ��="+rootStack.peek());
					rootStack.pop();
				}else {
					System.out.println("���û��� ��= -1");
				}
			}
			
			// size
			public void do_size() {
				System.out.println("���� size=" + rootStack.size());
			}		
			
			// empty
			public void do_empty() {
				if(rootStack.isEmpty()) 
				System.out.println("���� empty= 1");
				else System.out.println("���� empty= 0");
			}
			
			// top
			public void do_top() {
				if(!rootStack.isEmpty()) 
				  System.out.println("���û��� ��=" + rootStack.peek());
				else System.out.println("���û��� ��= -1");
			}	
		
			// random �Լ�
			public int ranNum() {
				double randomValue = Math.random(); // ���� 0.0 < randomValue < 1.0
				int firstNum = (int)(randomValue * 99) + 1; // randomValue(0.5 * 5) + 1 -> int �� ��ȯ
				return firstNum;
			}
}
