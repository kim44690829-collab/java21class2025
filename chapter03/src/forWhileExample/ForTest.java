package forWhileExample;

public class ForTest {

	public static void main(String[] args) {
		// 반복문 For
		int i = 0;
		for(i = 0; i <= 5; i++) {
			if(i == 3) {
				// break; // break는 조건에 만족하면 즉시 루프 탈출 (아래 모든 코드, 증감식 등 모든 것을 무시하고 탈출)
				continue; // continue는 조건에 만족하면 다시 for문으로 되돌아감(아래 모든 코드를 실행하지 않음.)
			}
			System.out.println(i);
		}
		System.out.println("루프 탈출 " + i);
		
		for(int j = 1; j <= 5; j++) {
			for(int k = 1; k <= 3; k++) {
//				if(k == 3) {
//					break;
//				}
				// System.out.printf("j => %d, k => %d%n", j, k);
			}
			if(j == 2) {
				break;
			}
			// System.out.println();
			System.out.println("밖의 루프" + j);
		}
		System.out.println("루프 탈출");
	}

}
