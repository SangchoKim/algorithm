package algo;

import java.util.LinkedList;
import java.util.Queue;

public class GetAcrossBridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		int answer = 0;
		Queue<Integer> ready = new LinkedList<Integer>();
		Queue<Integer> ing = new LinkedList<Integer>();
		int def = 0;
		boolean c = false;
		for (int i = 0; i < truck_weights.length; i++) {
			ready.add(truck_weights[i]);
		}
		
		while(!ready.isEmpty()) {
			
			if(ready.peek()>weight) {
				break;
			}
			
			int first = ready.poll();
			
			if(!c) {
				def = Math.abs(weight-first);
			}
			
			
			if(!c && def<ready.peek()) {
				// 다리를 건너는 중 한명만
				ing.add(first);
				c=false;
				answer+=bridge_length;
			}
			
			if(c && def>ready.peek()){
				  def = def - ready.peek();
				  ing.add(first);
				  c=true;
			}
			
			if(c) {
				
			}
		}
		System.out.println(ing.toString());
	}

}
