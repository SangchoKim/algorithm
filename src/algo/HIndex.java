package algo;

import java.util.Arrays;

public class HIndex {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int answer = new HIndex().solution(citations);
		System.out.println(answer);
	}
	
	public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int count = citations.length;
        
        for (int i = citations.length-1; i >= 0 ; i--) {
        	int c = 0;
        	for (int j = citations.length-1; j >= 0; j--) {
        		int num = citations[j];
        		if(num>=count) {
        			c++;
        		}
			}
        	if(c==count) {
    			answer=count;
    			break;
    		}
        	count--;
		}
        return answer;
    }
}
