package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle_4153 {
	
	
	public void doIt() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int a = Integer.parseInt(input[0]); // a 길이
		int b = Integer.parseInt(input[1]); // b 길이 
		int c = Integer.parseInt(input[2]); // 밑변길이
		StringBuilder builder = new StringBuilder(); 
		
		if(a==0||b==0||c==0) {
			return;
		}
		
		if(a*a+b*b==c*c) {
			builder.append("right");
		}else {
			builder.append("wrong");
		}
		
		System.out.println(builder);
	}

	
}
