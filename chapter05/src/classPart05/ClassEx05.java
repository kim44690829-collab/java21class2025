package classPart05;

import java.util.Random;

public class ClassEx05 {
	Random ra = new Random();
	
	int[] answer = {1, 3, 4, 2, 5};
	int[] hgd = new int[5];
	int count;
	
	public ClassEx05() {};
	
	public void answerList() { // 
		System.out.print("정 답 : ");
		// 확장 for문
		// for(자료형 변수 : 배열){ 실행문 ;}
		// 장점 
		// 1. index를 사용하지 않는다.
		// 2. 코드가 짧다.
		// 3. 요소를 하나씩 처리한다.
		// index를 비교할때는 사용하지 못함. => 즉, 출력할때 간편하게 할 수 있도록 돕는다.
		
		// int[] answer = {1, 3, 4, 2, 5};
		// answer 배열에서 값을 하나 꺼내서 n에 담고 출력
		// 배열이 끝날때까지 계속 순회
		for (int n : answer)
			System.out.print(n + " ");
		
//		for(int i = 0; i < answer.length; i++) {
//			System.out.print(answer[i] + " ");
//		}
		
		System.out.println();
	}
	
	public void hgdAnswer() { // 랜덤하게 답 출력하는 함수
		System.out.print("난 수 : ");
		for(int i = 0; i < hgd.length; i++) {
			hgd[i] = ra.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
		}
		System.out.println();
	}
	
	// return을 받으려면 score도 그냥 위로 합치는게 맞음.
	// 전역변수로 두면 그냥 void로 return을 쓸 필요 없음.
	public void errata() {
		System.out.print("정오표 : ");
		count = 0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("O ");
				count++;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println();
		//return count;
	}
	
	public int score() {
		int studentScore = 0;
		studentScore = count * 20;
		return studentScore;
	}
}
