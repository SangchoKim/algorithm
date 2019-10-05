package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Josepis_1158 { 

	public void doJo() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // �ο� �� 
		int k = Integer.parseInt(input[1]); // ���̴� �� 
		Queue<Integer> q = new LinkedList<Integer>(); // �ο��� ���� ť 
		StringBuilder builder = new StringBuilder(); // ������ ���� ����
		int count = 0; // �ε���
		
		for(int i=1 ; i<=n ; i++)
            q.add(i); // ť�� �ο� �߰�
		System.out.println(q);
		
		while(!q.isEmpty()) {
			
			if(count == k-1) { // k�� ���ڰ� ���� ��
				int num =q.poll();
				builder.append(num).append(" ");;
				count = count - (k-1);
			}else { // k�� ���ڰ� �ٸ� 
				int temp = 0; 
				temp = q.poll();
				q.add(temp);
				count++;
			}
		}
		System.out.println(builder);
		
	}
}
