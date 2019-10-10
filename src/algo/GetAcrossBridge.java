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
		Queue<Integer> done = new LinkedList<Integer>();
		int def = 0;
		for (int i = 0; i < truck_weights.length; i++) {
			ready.add(truck_weights[i]);
		}
		
		while(!ready.isEmpty()) {
			
			if(ready.peek()>weight) {
				break;
			}
			
			ing.add(ready.poll());
			answer+=bridge_length;
			def = Math.abs(weight-ing.peek());
			
			if(!ready.isEmpty() && def<ready.peek()) {
				done.add(ing.poll());
			}else if(!ready.isEmpty()&& def>ready.peek()){
				while(def<0) {
				  ing.add(ready.poll());
				  def -= ready.peek();
				}
				done.add(ing.poll());
				answer+=bridge_length;
			}else {
				done.add(ing.poll());
			}
			
			System.out.println(answer);
		}
	}

}
