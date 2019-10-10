package algo;

public class ChangeFirstLetter {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String[] a = s.toLowerCase().split("");
		String result = "";
		boolean ch = false;
		for (int i = 0; i < a.length; i++) {
			
			if(ch) {
				result += a[i].toUpperCase();
				ch = false;
			}else {
				result += a[i];
			}
			
			if(a[i].equals(" ")) {
				ch = true;
			}
		}
		System.out.println(result);
		
	}

}
