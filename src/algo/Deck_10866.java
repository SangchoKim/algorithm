package algo;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deck_10866 {
	
	Deque<Integer> deck = new LinkedList<Integer>(); 
	StringBuilder builder = new StringBuilder();
	Scanner reader = new Scanner(System.in);
	
	public void doIt() throws IOException {
		int count = 0;
		int numOfOrder = reader.nextInt();
		builder.append(numOfOrder).append("\n");
		
		while(numOfOrder>count) {
		String order = reader.next(); // 명령
		if(order.equals("push_front")) {
		 int num = reader.nextInt(); // 숫자 
		 push_front(num);
		}else if(order.equals("push_back")) {
		 int num = reader.nextInt(); // 숫자 
		 push_back(num);
		}else if(order.equals("pop_front"))
		 builder.append(pop_front()).append("\n");
		else if(order.equals("pop_back"))
		 builder.append(pop_back()).append("\n");
		else if(order.equals("size"))
		 builder.append(size()).append("\n");
		else if(order.equals("empty"))
		 builder.append(empty()).append("\n");
		else if(order.equals("front"))
		 builder.append(front()).append("\n");
		else if(order.equals("back"))
		 builder.append(back()).append("\n");
		
		count++;
	}	
		System.out.println(builder);
	}
	
	// push_front
	public void push_front(int num) {
		deck.addFirst(num);
	}

	// push_back 
	public void push_back (int num) {
		deck.addLast(num);
	}
		
	// pop_front 
	public int pop_front() {
		if(!deck.isEmpty()) return deck.pollFirst(); else return -1;
	}
	
	// pop_back 
	public int pop_back() {
		if(!deck.isEmpty()) return deck.pollLast(); else return -1;
	}
	
	// size 
	public int size() {
		return deck.size();
	}
	
	// empty 
	public int empty() {
		if(deck.isEmpty())
			return 1;
		else 
			return 0;
	}
	
	// front 
	public int front() {
		if(!deck.isEmpty()) return deck.peekFirst(); else return -1;
	}
	
	// back 
	public int back() {
		if(!deck.isEmpty()) return deck.peekLast(); else return -1;
	}
		
}
