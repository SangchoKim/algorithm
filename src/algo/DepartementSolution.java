package algo;

public class DepartementSolution {

	public static void main(String[] args) {
		int [] d = {1,3,2,5,4};
		int buget = 9;
		int answer = 0;
		
		
		for (int i = 0; i < d.length-2; i++) {
			for (int j = i+1; j < d.length-1; j++) {
				for (int j2 = j+1; j2 < d.length; j2++) {
					if(buget==d[i]+d[j]+d[j2]) {
						answer++;
						System.out.println(answer);
					}
				}
			}
		}
		
		
	}

}
