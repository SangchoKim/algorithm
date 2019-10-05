package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySolution {

	public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			int first = commands[i][0];
			int second = commands[i][1];
			List temp = new ArrayList();
			for (int j = first-1; j < second; j++) {
				temp.add(arr[j]);
			}
			Collections.sort(temp);
			answer[i] = (int) temp.get(commands[i][2]-1);
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}

}
