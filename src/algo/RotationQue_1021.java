package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class RotationQue_1021 {

	Deque<Integer> deck = new LinkedList<Integer>(); 
	
	public void doIt() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = reader.readLine().split(" ");
		int s = Integer.parseInt(input1[0]); // 큐의 크기  
		int n = Integer.parseInt(input1[1]); // 뽑아내려고 하는 갯수
		int count = 0; // 최소값
		int max = 0; // count
		String[] input2 = reader.readLine().split(" ");

		
		// 숫자를 담는다.
		for (int i = 1; i <= s; i++) {
			deck.add(i);
		}
		
	
		while(n>max) {
			
			int l = Integer.parseInt(input2[max]); // 수의 위치
			int half = deck.size()/2;
			if(0==half%2) half++;
			
			if(half>=l) { //수의 위치가 half 보다 작을때
				while(true) {
				int num = deck.peekFirst();
				if(num == l) {
					max ++;
					deck.pollFirst();
					break;
				}else {
					count ++;
					int temp = deck.pollFirst();
					deck.addLast(temp);
				}
			}
			}else if(half<=l) { //수의 위치가 half 보다 클때
				while(true) {
				int num = deck.peekLast();
				if(num == l) {
					max ++;
					deck.pollLast();
					break;
				}else {
					count ++;
					int temp = deck.pollLast();
					deck.addFirst(temp);
				}
			}
			}
		}
		
		System.out.println(count);
	}
}
