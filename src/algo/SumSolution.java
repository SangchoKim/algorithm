package algo;

import java.util.Scanner;

public class SumSolution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String n = String.valueOf(input);
		int s = n.length();
		int reminder = (int) Math.pow(10,s);
		int sum = 0;
		
		while(true) {	
			if(input == 0) {
				System.out.println(sum);
				break;
			}
			reminder = reminder/10;
			sum += input/reminder;
			input = input%reminder;
		}
		
	}

}
