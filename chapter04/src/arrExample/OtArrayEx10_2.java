package arrExample;

import java.util.*;

public class OtArrayEx10_2 {

	public static void main(String[] args) {
		// 영화 예매 프로그램 규칙 정리
		// 1. 좌석 상태 값 정의 => 0 : [ ] (비어있는 좌석) / 1 : [O] (현재 선택중인 좌석) / 2 : [X] (예매 완료된 좌석) / 3 : [!] (예매 불가 좌석)
		
		Scanner scan = new Scanner(System.in);
		
		// 좌석 10개로 배열 지정 => 기본값 : 0 (모두 비어있는 상태)
		int[] seat = new int[10];
		
		// 전체 예매 인원 수 (총 매출 계산 용)
		int cnt = 0;
		
		// 프로그램 실행 여부를 제어하는 변수
		boolean run = true;
		
		// 메인 메뉴 선택
		while(run) {
			System.out.println();
			System.out.println(" === 메가 영화관 === ");
			System.out.println("1.좌석 예매");
			System.out.println("2.종료");
			System.out.println("3.취소");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			// ================================ 1. 좌석 예매 ===================================
			if(sel == 1) {
				System.out.print("예매 인원을 입력하세요[1 ~ 10] : ");
				int inwon = scan.nextInt(); // 내가 입력한 인원수
				
				// 예매 인원 유효성 검사
				if( 1 <= inwon  && inwon <= 10) {
					// --------------------- 1명 예매일 경우
					if(inwon == 1) {
						// 1명 예매
						// 짝수 좌석 선택 불가 [!] => 3
						// 홀수 좌석만 예매 가능
						
						for(int i = 0; i < seat.length; i++) {
							// 2, 4, 6, 8 => 배열은 index가 0부터 시작함 => 사실 짝수 좌석이 아닌 홀수좌석을 선택불가로 지정해야함.
							if(i % 2 != 0 && seat[i] != 2) {
								seat[i] = 3;
							}
						}
						// 현재 예매가능 좌석 상태 출력
//						for(int i = 0; i < seat.length; i++) {
//							if(seat[i] == 0) {
//								System.out.println("[ ]");
//							}else if(seat[i] == 2) {
//								System.out.println("[X]");
//							}else if(seat[i] == 3) {
//								System.out.println("[!]");
//							}else {
//								System.out.println("[O]");
//							}
//						}
						for(int i = 0; i < seat.length; i++) {
							if(seat[i] == 0) System.out.print("[ ]");
							else if(seat[i] == 2) System.out.print("[X]");
							else if(seat[i] == 3) System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();
						
						// 좌석 선택
						System.out.print("좌석번호 선택[1 ~ 10] : ");
						int idx = scan.nextInt() - 1; // -1 을 하는 이유 : index는 0부터 시작하기 때문에
						
						// 이미 선택된 좌석 예외처리
						if(seat[idx] == 2) {
							System.out.println("이미 예약된 좌석입니다.");
						}else if(idx % 2 != 0){
							// 짝수 좌석 선택시
							System.out.println("예매 불가능한 좌석입니다.");
						}else {
							// 정상 예매
							seat[idx] = 1; // 선택 상태 [O]
							System.out.println("예매 완료");
							// 예매 완료 후 cnt에 인원수 누적
							cnt++;
						}
						// 선택 후 좌석 출력
						for(int i = 0; i < seat.length; i++) {
							if(seat[i] == 0) System.out.print("[ ]");
							else if(seat[i] == 2) System.out.print("[X]");
							else if(seat[i] == 3) System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();
					}
				}else {
					System.out.println("예매 인원을 확인하세요.");
				}
				
				// ---------------------- 2명 이상 예매일 경우
				if(2 <= inwon && inwon <= 10) {
					// 현재 좌석 출력
					for(int i = 0; i < seat.length; i++) {
						if(seat[i] == 0) System.out.print("[ ]");
						else if(seat[i] == 2) System.out.print("[X]");
						else if(seat[i] == 3) System.out.print("[!]");
						else System.out.print("[O]");
					}
					System.out.println();
					
					int selectCnt = 0; // 현재 선택한 인원 수를 담는 변수
					// 인원수만큼 좌석 선택을 반복
					// inwon = 4, 현재 선택한 인원 selectCnt = 2;
					// selectCnt가 최초에 선택한 인원보다 작으면 아직 좌석 선택이 다 끝나지 않음.
					while(selectCnt < inwon) {
						System.out.print("좌석 번호 선택[1 ~ 10] : ");
						int idx1 = scan.nextInt() - 1;
						// 좌석 번호 범위 체크 예외처리
						if(10 <= idx1 || idx1 < 0) {
							System.out.println("좌석 번호 오류");
							continue;
						}
						// selectCnt의 인원 중 마지막 1명이 남았을 경우
						// 전체 예매 인원 중 아직 선택하지 않은 사람이 1명 일 때 실행 
						if(inwon - selectCnt == 1) {
							// 이미 선택되었거나 예매 완료된 좌석이면 선택 불가
							if(seat[idx1] == 1 || seat[idx1] == 2) {
								System.out.println("이미 선택되었거나 예매된 좌석입니다.");
								continue;
							}
							// 세팅 부분
							// 해당 좌석을 선택중[O] 상태로 변환
							seat[idx1] = 1;
							// 전체 예매 인원수 누적
							cnt++;
							// 현재 선택 완료된 인원 수 1명 증가
							selectCnt++;
						}else {
							// 2명 이상 남았을 경우
							// 연속해서 2좌석 함께 선택되어야 함
							// 배열 범위를 벗어나거나 이미 선택된 좌석이거나 예매 완료된 좌석은 선택불가 처리
							if(idx1 >= 9 || seat[idx1] == 1 || seat[idx1 + 1] == 1 || seat[idx1] == 2 || seat[idx1 + 1] == 2) {
								System.out.println("이미 선택되거나 예매된 좌석입니다.");
								continue;
							}
							
							// 세팅 부분
							// 현재 선택된 좌석과 바로 옆좌석을 선택중[O] 상태로 변경
							seat[idx1] = 1;
							seat[idx1 + 1] = 1;
							// 전체 예매 인원수 누적
							cnt += 2;
							// 현재 선택 완료된 인원 수 1명 증가
							selectCnt += 2;
						}
						// 좌석 출력
						for(int i = 0; i < seat.length; i++) {
							if(seat[i] == 0) System.out.print("[ ]");
							else if(seat[i] == 2) System.out.print("[X]");
							else if(seat[i] == 3) System.out.print("[!]");
							else System.out.print("[O]");
						}
						System.out.println();
					}
					// ---------------- 예매 확정 처리
					// 예매 확정 [X]로 상태 변환
					// 예매 불가능 [!] => 다시 [ ]로 변환
					for(int i = 0; i < seat.length; i++) {
						if(seat[i] == 3) seat[i] = 0;
						else if(seat[i] == 1) seat[i] = 2;
					}
					
				}else {
					System.out.println("예매 인원을 확인하세요.");
				}
				
				
			}else if(sel == 2) {
				// 총 매출액 계산할 예정
				int total = cnt * 12000;
				System.out.println("매출액 : " + total + "원");
				System.out.println("인원수 : " + cnt + "명");
				// 종료
				run = false;
				System.out.println("프로그램 종료");
			}else {
				
			}
		}
		
		// ========================== 개발 종료 ===========================
					scan.close();
	}
}
