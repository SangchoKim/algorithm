package algo;

import java.util.Arrays;
import java.util.List;

public class FIndKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		List list = Arrays.asList(seoul);
		int i = list.indexOf("Kim");
		answer = "�輭���� "+ String.valueOf(i)+"�� �ִ�";
		System.out.println(answer);
	}

}
