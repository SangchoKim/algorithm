package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLetterSolution {

	public static void main(String[] args) {
		
		String answer = "Zbcdefg";
		List m = Arrays.asList(answer.split(""));
		Collections.sort(m, Collections.reverseOrder());
		answer = String.join("",m);
		System.out.println(answer);

	}

}
