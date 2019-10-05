package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class RotationQ_1021 {

	public void doIt() throws IOException { 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String[] nm = bf.readLine().split(" ");  // 큐의 크기, 뽑아내려고 하는 개수
		String[] seq = bf.readLine().split(" "); // 뽑아내려고 하는 수의 위치
		int size = Integer.parseInt(nm[0]); // 큐의 크기
		CircleQueue q = new CircleQueue(size, seq); 
		System.out.println(q.getCount()); 
		bf.close(); 
		
	}
}



class CircleQueue { 
	
	private LinkedList<Integer> list = new LinkedList<Integer>(); 
	private int count = 0; 
	private String[] seq; // 뽑아내려고 하는 수의 위치가 들어가있는 배열 
	
	// 리스트 안에다 숫자를 add 한다. 
	CircleQueue(int size, String[] seq) { 
		for (int i = 1; i <= size; i++) { 
			list.add(i); 
			} 
		this.seq = seq; 
		start(); 
		} 
	
	
	private void start() { 
		int length = seq.length; // 뽑아내려고 하는 수의 위치가 들어가 있는 배열의 크기
		for (int i = 0; i < length; i++) { 
			int n = Integer.parseInt(seq[i]);  // 뽑아내려고 하는 수의 위치가 들어가 있는 배열의 인덱스 i
			operate(n); 
			} 
		} 
	
	private void operate(int num) { 
		while (true) { 
			int pos = list.indexOf(num); // 인덱스
			int size = list.size(); // 리스트 사이즈
			int left = pos; // left -> head
			int right = size - pos - 1;  // right -> tail
			if (left == 0) { 
				list.remove(pos); // 인덱스가 0이 되었을 때 리스트에 들어가 있는 숫자를 꺼내서 삭제 
				break; 
				} if (left <= right) {
//					2번 연산 왼쪽으로 한칸 이동 
					list.addLast(list.removeFirst());
					++count; 
					
					} else { 
//						3번 연산 오른쪽으로 한칸 이동 
						list.addFirst(list.removeLast());
						++count; 
						} 
				} 
		} 
	
	public int getCount() { return count; }
}