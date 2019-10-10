package algo;

import java.util.Arrays;

public class FindMaxMin {

	public static void main(String[] args) {
		String s = "-1 -1";
		String answer = "";
		String[] arr = s.split(" ");
		int [] arr1 = new int[arr.length];
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Integer.valueOf(arr[i]);
		}
		
		Arrays.sort(arr1);
		result.append(arr1[0]).append(" ").append(arr1[arr1.length-1]);
		answer = result.toString();
	}

}
