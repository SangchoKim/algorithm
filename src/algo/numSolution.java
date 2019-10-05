package algo;

import java.util.Scanner;

public class numSolution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int num = 1;
		int sum = 0;
		
		while(true) {
			if(input%num==0) {
				sum += num;
			}
			
			if(num>=input) {
				System.out.println(sum);
				break;
			}
			
			num++;
		}	
	}

}
