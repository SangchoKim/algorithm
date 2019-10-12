package algo;

public class OneTwoFour {

	public static void main(String[] args) {
		
		String a = new OneTwoFour().solution(27);
		System.out.println(a);
	}
	
	 public String solution(int n) {
	     
		 String answer ="";
		 int rmd;
		 
		 while(n>0) {
		
			 rmd = n%3;
			 n = n/3;
			 
			 if(rmd==0) {
				 n = n-1;
				rmd = 4;
			 }
			 
			 answer = rmd + answer;
		 }
		 
		return answer;
	  }

}
