package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemicalSolution {

	public static void main(String[] args) {
		
		int [] nums = {1,2,7,6,4};
		
		List list = new ArrayList();
		Arrays.sort(nums);
		int sum = 0;
	
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int m = j+1; m < nums.length; m++) {
					list.add(nums[i]+nums[j]+nums[m]);
				}
			}
		}
		
		// 소수찾기
		boolean check = false;
		for (int i = 0; i < list.size(); i++) {
			int max = (int) list.get(i);
			check = false;
			for (int j = 2; j < max; j++) {
				if(max/j==1) {
					//소수 분별 -> 자기 자신과 나눴을때 값이 1이되는 수 
					check = true;
				}
				
				if(max%j==0) {
					// 소수가 아님
					break;
				}
				
				if(check) {
					// 소수인 경우 
					sum++;
					break;
				}
			}
			
		}
		
		System.out.println(sum);
	}

}
