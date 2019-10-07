package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetPropertySolution {

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int[] answer = new int[land.length];
		int max = 0;
		int indexRow = 0;
		int indexArr = 0;
		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < 4; j++) {
				if(land[i][j]>max) {
					max = land[i][j];
					indexArr = j;
				}		
			}
			answer[i] = indexArr;
			max = 0;
			
		}
		
	}

}
