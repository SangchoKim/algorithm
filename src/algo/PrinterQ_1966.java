package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class PrinterQ_1966 {

public void do_start() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Test_q = Integer.parseInt(reader.readLine());  // 테스트 큐 ex) 1
        LinkedList<Integer> queue = new LinkedList<>(); // 큐
        StringBuilder builder = new StringBuilder(); // 정답을 담을 빌더
        
        for(int n=0 ; n<Test_q ; n++){
            String[] input = reader.readLine().split(" "); // 두번째 라인 ex) 4 2
            String[] priority = reader.readLine().split(" "); // 중요도 ex) 1 2 3 4 
            int num = Integer.parseInt(input[0]); // number ex) 4
            int M = Integer.parseInt(input[1]); // 문제 ex) 2
            int A = 0; // 정답
            queue.clear(); // 큐 초기화
            
            for(int i=0 ; i<num ; i++)
                queue.add(Integer.parseInt(priority[i])); // 큐에 중요도 데이터 추가 ex) 1, 2, 3, 4 => 1=0, 2=1, 3=2, 4=3
            
            while(!queue.isEmpty()){
                boolean isPriority = true;
                
                for(int i=1 ; i<queue.size() ; i++){ // 맨 앞 데이터의 중요도가 가장 높은지 확인
                    if(queue.peek() < queue.get(i)){
                        isPriority = false;
                        break;
                    }
                }
                
                if(isPriority){ // 가장 높다면 큐에서 제거, 구하려는 값이 아니라면 M값 갱신
                    A++;
                    queue.poll();
                    
                    if(M == 0)
                        break;
                    else 
                        M -= 1;
                }
                else { // 중요도가 가장 높은 문서가 아니라면 뒤로 보내고 M값 갱신
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
