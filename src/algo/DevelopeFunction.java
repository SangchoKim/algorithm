package algo;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopeFunction {

	public static void main(String[] args) {
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5 , 10, 7};
		new DevelopeFunction().solution(progresses, speeds);

	}
	
	
	public int[] solution(int[] progresses, int[] speeds) {
        
        List arr = new LinkedList();
        Queue<Integer> tmp = new LinkedList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        int done = 100;
        for (int i = 0; i < progresses.length; i++) {
        	q.add(progresses[i]);
		}
        
       for (int i = 0; i < progresses.length; i++) {
    	   int p = q.peek();
    	   if(p <= done) {
    		   // 완료가 안된 경우 
    		   int compare = p;
    		   int count = 0;
    		   while(true) {
    			 if(compare >= done) {
    				 q.poll();
    				 tmp.add(count);
    				 break;
    			 }
    			 compare+=speeds[i];
    			 count++;
    		   }
    	   }else {
    		// 완료가 된 경우 
    		 
    		 break;  
    	   }
       }
       
      
      
      int count1 = 1;
      
      int n = tmp.poll(); 
      while(!tmp.isEmpty()) {
    	 if(n > tmp.peek()) {
    		 count1++;
    		 tmp.poll();
    	 }else {
    		 n = tmp.poll();
    		 arr.add(count1);
    		 count1 = 1;
    	 } 
      }
      arr.add(count1);
      
      int[] answer = new int [arr.size()];
	      for (int i = 0; i < arr.size(); i++) {
			answer[i] = (int) arr.get(i);
	      }
      
	     for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		} 
       return answer;
    }

}
