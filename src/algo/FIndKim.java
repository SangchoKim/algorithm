package algo;

import java.util.Arrays;
import java.util.List;

public class FIndKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		List list = Arrays.asList(seoul);
		int i = list.indexOf("Kim");
		answer = "김서방은 "+ String.valueOf(i)+"에 있다";
		System.out.println(answer);
	}

}
