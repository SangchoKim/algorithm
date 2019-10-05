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
		int s = Integer.parseInt(input1[0]); // ť�� ũ��  
		int n = Integer.parseInt(input1[1]); // �̾Ƴ����� �ϴ� ����
		int count = 0; // �ּҰ�
		int max = 0; // count
		String[] input2 = reader.readLine().split(" ");

		
		// ���ڸ� ��´�.
		for (int i = 1; i <= s; i++) {
			deck.add(i);
		}
		
	
		while(n>max) {
			
			int l = Integer.parseInt(input2[max]); // ���� ��ġ
			int half = deck.size()/2;
			if(0==half%2) half++;
			
			if(half>=l) { //���� ��ġ�� half ���� ������
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
			}else if(half<=l) { //���� ��ġ�� half ���� Ŭ��
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
