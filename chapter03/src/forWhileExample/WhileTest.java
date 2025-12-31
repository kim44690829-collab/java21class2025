package forWhileExample;

public class WhileTest {

	public static void main(String[] args) {
		// while(조건) 문은 괄호 안의 조건을 만족할때까지(true) loop(루프)를 돌린다 -> 반복한다. 
		// 조건이 false가 되면 loop를 빠져나간다.
		
		int num = 10; // 조건 : 1씩 누적하기 위한 변수
		// int sum = 0; // 총 합계를 구하기 위한 변수
		
		// 1부터 10까지의 값을 더한 값을 출력할 예정
//		while(num <= 10) {
//			sum += num;
//			// 누적되지 않으면 무한루프 -> 1은 항상 10보다 작으니까.
//			num++; // num = num + 1 -> 현재 숫자인 1부터 10까지 증가
//			System.out.printf("sum : %d, num : %d%n",sum, num);
//		}
		
//		while(true) {
//			sum += num;
//			num++;
//			break; // 루프를 빠져나옴
//		}
//		System.out.printf("sum : %d, num : %d%n",sum, num);
		
		// 문제 1 ) 10 ~ 1까지 반복해서 6 ~ 3 까지 거꾸로 출력
		// 정답 ) 6, 5, 4, 3
		while(1 <= num) {
			if(3 <= num && num <= 6) {
				System.out.print(num + ", ");
			}
			num--;
		}
		
	}

}
