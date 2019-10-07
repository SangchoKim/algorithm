package algo;

import java.util.Date;

public class FindDate {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		String answer = "";
		String[] date = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		answer=date[new Date(2016,a-1,b).getDay()-1];
		System.out.println(answer);
	}

}
