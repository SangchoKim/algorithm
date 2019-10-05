package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class PrinterQ_1966 {

public void do_start() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Test_q = Integer.parseInt(reader.readLine());  // �׽�Ʈ ť ex) 1
        LinkedList<Integer> queue = new LinkedList<>(); // ť
        StringBuilder builder = new StringBuilder(); // ������ ���� ����
        
        for(int n=0 ; n<Test_q ; n++){
            String[] input = reader.readLine().split(" "); // �ι�° ���� ex) 4 2
            String[] priority = reader.readLine().split(" "); // �߿䵵 ex) 1 2 3 4 
            int num = Integer.parseInt(input[0]); // number ex) 4
            int M = Integer.parseInt(input[1]); // ���� ex) 2
            int A = 0; // ����
            queue.clear(); // ť �ʱ�ȭ
            
            for(int i=0 ; i<num ; i++)
                queue.add(Integer.parseInt(priority[i])); // ť�� �߿䵵 ������ �߰� ex) 1, 2, 3, 4 => 1=0, 2=1, 3=2, 4=3
            
            while(!queue.isEmpty()){
                boolean isPriority = true;
                
                for(int i=1 ; i<queue.size() ; i++){ // �� �� �������� �߿䵵�� ���� ������ Ȯ��
                    if(queue.peek() < queue.get(i)){
                        isPriority = false;
                        break;
                    }
                }
                
                if(isPriority){ // ���� ���ٸ� ť���� ����, ���Ϸ��� ���� �ƴ϶�� M�� ����
                    A++;
                    queue.poll();
                    
                    if(M == 0)
                        break;
                    else 
                        M -= 1;
                }
                else { // �߿䵵�� ���� ���� ������ �ƴ϶�� �ڷ� ������ M�� ����
                    int temp = queue.poll();
                    queue.add(temp);
                    M = (M==0) ? queue.size()-1 : --M;
                }
            }
            builder.append(A).append("\n");
        }
        System.out.println(builder);
	}
}
