package algo;

public class addSolution {

	public static void main(String[] args) {
		int n = 123;
		String[] m = String.valueOf(n).split("");
		int r = 0;
		for(String z:m) {
			r += Integer.valueOf(z);
		}
		System.out.println(r);
	}

}
