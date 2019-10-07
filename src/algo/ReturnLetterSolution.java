package algo;

import java.util.ArrayList;
import java.util.List;

public class ReturnLetterSolution {

	public static void main(String[] args) {
		String answer = "qwer";
		String[] list = answer.split("");
		List l = new ArrayList();
		for (int i = 0; i < list.length; i++) {
			if(answer.length()%2==1) {
				l.add(list[answer.length()/2]);
				break;
			}else {
				l.add(list[answer.length()/2-1]);
				l.add(list[answer.length()/2]);
				break;
			}
		}
		
		System.out.println(String.join("", l));
	}

}
