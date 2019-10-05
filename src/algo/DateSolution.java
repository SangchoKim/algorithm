package algo;

import java.util.Scanner;

public class DateSolution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int sum =  scan.nextInt();
		
		while(true) {
			if(sum==1) {
				System.out.println(answer);
				break;
			}
			
			if(answer == 100) {
				answer = -1;
				System.out.println(answer);
				break;
			}
			
			if(sum%2 == 0) {
				sum = sum/2;
				answer ++;
			}else if(sum%2 == 1){
				sum = (sum * 3) + 1;
				answer ++;
			}
		}		
	}
}
