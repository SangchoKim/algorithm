package algo;

import java.util.Stack;

public class Top_2493 {
	
	public int topNum() {
		double randomValue = Math.random(); // 범위 0.0 < randomValue < 1.0
		int firstNum = (int)(randomValue * 99) + 1; // randomValue(0.5 * 5) + 1 -> int 형 변환
		return firstNum;
	}
	
	public int topHeight() {
		double randomValue = Math.random(); // 범위 0.0 < randomValue < 1.0
		int topHeight = (int)(randomValue * 99) + 1; // randomValue(0.5 * 5) + 1 -> int 형 변환
		return topHeight;
	}

	public void solve() {
		int n = topNum(); // 탑의 갯수
		StringBuilder sb = new StringBuilder(); // 스트링 빌더 호출 -> 결과 값 찍어내기 위해서
		StringBuilder sbNum = new StringBuilder(); // 스트링 빌더 호출 -> 탑의 높이 찍어내기 위해서 
		Stack<Integer> rootStack = new Stack<>(); // 가장 상위에 있는 Stack 값
		Stack<Integer> indexStack = new Stack<>(); // 상위에 있는 값의 index 값
	
		
		System.out.println("탑의 수:"+n); // 탑의 수 출력
		

		int first = topHeight(); // 첫번째 탑 
		
		rootStack.push(first);
		indexStack.push(1);
		sb.append("0 "); // 한칸 띄워야 하니까
		sbNum.append(first+",");
		for(int i=2;i<=n;i++) {
			int value = topHeight(); // 첫번째 이후의 탑
			sbNum.append(value+",");
			

			// 탑은 가장 가까이 존재하고 자신보다 높은 탑에 닿는다.
			// 좌측 탑들을 비교할 때 현재 탑보다 높이가 낮다면 더 이상 비교할 필요가 없다.
			// 예를 들어 7 9 가 존재한다면, 다음 탑이 3이라면 좌측 탑 중 9에 닿는다.
			// 이후 5가 들어온다면, 이전 탑 3이 아닌 9에 닿는다.
			// 이후 2가 들어온다면, 이전 탑 5에 닿는다.
			// 7 9 3 5 2 -> 왼쪽 탑보다 오른쪽 탑이 클 경우 왼쪽 탑은 무시해도 상관없다. 3과 5처럼 5가 높이 3을 막고 있기 때문이다.   
		
			while(!rootStack.isEmpty()) { // 스택 값이 있는 지 확인
				if (value < rootStack.peek()) {  // 스택 가장 상위에 있는 값과 랜덤 수와 비교 
					sb.append(indexStack.peek() + " "); // 스택 상위에 있는 값이 컸을 때, sb 호출해서 
					break;
				}
				rootStack.pop();
				indexStack.pop();
			}
			
			
			if (rootStack.isEmpty()) {
				sb.append("0 ");
			}
			rootStack.push(value);
			indexStack.push(i);
		}
		System.out.println("탑의 높이="+ sbNum.toString());
		System.out.println("결과 값="+sb.toString());
	}
}
