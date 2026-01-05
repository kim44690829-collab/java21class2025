package multiArrExample;

public class MultiArrTest {
	
	public static void main(String[] args) {
		
		// 다차원 배열 선언 및 초기화
		// int[][] score = new int[3][];
		// score[0] = new int[2]; 와 같이 하나하나 길이를 넣어줘야함
		int[][] score = {
				{95, 60},
				{50, 50, 80},
				{100, 75, 89, 68, 59},
		};
		
		// score 값 출력
		// 다차원 배열은 출력시 다중 for문을 이용한다.
		// score.length => 행의 개수를 의미
		// score[i].length => 열의 개수를 의미
		for(int i = 0; i < score.length; i++) {
			// i = 0 일때 j 는 2번 루프
			// i = 1 일때 j 는 3번 루프
			// i = 2 일때 j 는 5번 루프
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
