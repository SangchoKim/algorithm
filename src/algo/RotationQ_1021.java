package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class RotationQ_1021 {

	public void doIt() throws IOException { 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String[] nm = bf.readLine().split(" ");  // ť�� ũ��, �̾Ƴ����� �ϴ� ����
		String[] seq = bf.readLine().split(" "); // �̾Ƴ����� �ϴ� ���� ��ġ
		int size = Integer.parseInt(nm[0]); // ť�� ũ��
		CircleQueue q = new CircleQueue(size, seq); 
		System.out.println(q.getCount()); 
		bf.close(); 
		
	}
}



class CircleQueue { 
	
	private LinkedList<Integer> list = new LinkedList<Integer>(); 
	private int count = 0; 
	private String[] seq; // �̾Ƴ����� �ϴ� ���� ��ġ�� ���ִ� �迭 
	
	// ����Ʈ �ȿ��� ���ڸ� add �Ѵ�. 
	CircleQueue(int size, String[] seq) { 
		for (int i = 1; i <= size; i++) { 
			list.add(i); 
			} 
		this.seq = seq; 
		start(); 
		} 
	
	
	private void start() { 
		int length = seq.length; // �̾Ƴ����� �ϴ� ���� ��ġ�� �� �ִ� �迭�� ũ��
		for (int i = 0; i < length; i++) { 
			int n = Integer.parseInt(seq[i]);  // �̾Ƴ����� �ϴ� ���� ��ġ�� �� �ִ� �迭�� �ε��� i
			operate(n); 
			} 
		} 
	
	private void operate(int num) { 
		while (true) { 
			int pos = list.indexOf(num); // �ε���
			int size = list.size(); // ����Ʈ ������
			int left = pos; // left -> head
			int right = size - pos - 1;  // right -> tail
			if (left == 0) { 
				list.remove(pos); // �ε����� 0�� �Ǿ��� �� ����Ʈ�� �� �ִ� ���ڸ� ������ ���� 
				break; 
				} if (left <= right) {
//					2�� ���� �������� ��ĭ �̵� 
					list.addLast(list.removeFirst());
					++count; 
					
					} else { 
//						3�� ���� ���������� ��ĭ �̵� 
						list.addFirst(list.removeLast());
						++count; 
						} 
				} 
		} 
	
	public int getCount() { return count; }
}