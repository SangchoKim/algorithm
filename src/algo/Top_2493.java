package algo;

import java.util.Stack;

public class Top_2493 {
	
	public int topNum() {
		double randomValue = Math.random(); // ���� 0.0 < randomValue < 1.0
		int firstNum = (int)(randomValue * 99) + 1; // randomValue(0.5 * 5) + 1 -> int �� ��ȯ
		return firstNum;
	}
	
	public int topHeight() {
		double randomValue = Math.random(); // ���� 0.0 < randomValue < 1.0
		int topHeight = (int)(randomValue * 99) + 1; // randomValue(0.5 * 5) + 1 -> int �� ��ȯ
		return topHeight;
	}

	public void solve() {
		int n = topNum(); // ž�� ����
		StringBuilder sb = new StringBuilder(); // ��Ʈ�� ���� ȣ�� -> ��� �� ���� ���ؼ�
		StringBuilder sbNum = new StringBuilder(); // ��Ʈ�� ���� ȣ�� -> ž�� ���� ���� ���ؼ� 
		Stack<Integer> rootStack = new Stack<>(); // ���� ������ �ִ� Stack ��
		Stack<Integer> indexStack = new Stack<>(); // ������ �ִ� ���� index ��
	
		
		System.out.println("ž�� ��:"+n); // ž�� �� ���
		

		int first = topHeight(); // ù��° ž 
		
		rootStack.push(first);
		indexStack.push(1);
		sb.append("0 "); // ��ĭ ����� �ϴϱ�
		sbNum.append(first+",");
		for(int i=2;i<=n;i++) {
			int value = topHeight(); // ù��° ������ ž
			sbNum.append(value+",");
			

			// ž�� ���� ������ �����ϰ� �ڽź��� ���� ž�� ��´�.
			// ���� ž���� ���� �� ���� ž���� ���̰� ���ٸ� �� �̻� ���� �ʿ䰡 ����.
			// ���� ��� 7 9 �� �����Ѵٸ�, ���� ž�� 3�̶�� ���� ž �� 9�� ��´�.
			// ���� 5�� ���´ٸ�, ���� ž 3�� �ƴ� 9�� ��´�.
			// ���� 2�� ���´ٸ�, ���� ž 5�� ��´�.
			// 7 9 3 5 2 -> ���� ž���� ������ ž�� Ŭ ��� ���� ž�� �����ص� �������. 3�� 5ó�� 5�� ���� 3�� ���� �ֱ� �����̴�.   
		
			while(!rootStack.isEmpty()) { // ���� ���� �ִ� �� Ȯ��
				if (value < rootStack.peek()) {  // ���� ���� ������ �ִ� ���� ���� ���� �� 
					sb.append(indexStack.peek() + " "); // ���� ������ �ִ� ���� ���� ��, sb ȣ���ؼ� 
					break;
				}
				rootStack.pop();
				indexStack.pop();
			}
			
			
			if (rootStack.isEmpty()) {
				sb.append("0 ");
			}
			rootStack.push(value);
			indexStack.push(i);
		}
		System.out.println("ž�� ����="+ sbNum.toString());
		System.out.println("��� ��="+sb.toString());
	}
}
