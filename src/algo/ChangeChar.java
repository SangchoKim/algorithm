package algo;

public class ChangeChar {

	public static void main(String[] args) {
		
		String answer = "try hellow world";
		char [] arr = answer.toCharArray();
 		StringBuffer result = new StringBuffer();
 		int index = 0;
 		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' ') {
				result.append(arr[i]);
				index = 0;
			}else{
				if(index%2==0) {
					String a = String.valueOf(arr[i]);
					a = a.toUpperCase();
					result.append(a);
					index++;
				}else if(index%2==1){
					String a = String.valueOf(arr[i]);
					a = a.toLowerCase();
					result.append(a);
					index++;
				}
			}
		}
		System.out.println(result);
	}
}
