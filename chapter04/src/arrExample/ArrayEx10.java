package arrExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		// String[] seatS = new String[7];
		String[] seatS = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
//		seat[0] = 1;
//		if(seat[0] == 1) {
//			seatS[0] = "O";
//		}
		boolean run = true; // while문 실행
		int seatCom = -1; // 예약 완료된 좌석
		int seatNum = 0; // 선택한 좌석
		int price = 12000; // 티켓 하나의 가격
		int totalPrice = 0; // 총 가격
		
		while(run) {
			System.out.println(); // 한줄 공백
			System.out.println("현재 예매 가능한 좌석"); // 최초 예매 가능한 좌석
			for(int i = 0; i < seatS.length; i++) {
				System.out.print(seatS[i]);
			}
			
			System.out.println(); // 한줄 공백
			
			System.out.println("\n=== 메가 영화관 ==="); // 영화관 메뉴 시작
			System.out.print("1.좌석 예매\n2.종료\n메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu == 1) { // 좌석 예매 선택
				System.out.print("예매 인원을 입력하세요[1~7] : "); // 예매 인원 선택
				int seatSelect = scan.nextInt();
				if(seatSelect == 1) { // 예매 인원이 1일 경우 짝수 좌석 선택 불가
					System.out.println("현재 선택 가능한 좌석");
					for(int i = 0; i < seatS.length; i++) { // 선택 불가능 좌석에 x표시
						if( ((i + 1) % 2 == 0) && seat[i] != 1) {
							seat[i] = -1;
						}
						if(seat[i] == -1) {
							seatS[i] = "[X]";
						}
						System.out.print(seatS[i]);
					}
					System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
					seatNum = scan.nextInt();
					for(int i = 0; i < seat.length; i++ ) {
						if((seatNum % 2 == 0)&& (seatNum <= 7) && (seat[i] != 1)) { // 짝수 좌석 선택시 예매 불가능, 이후 처음으로 돌아가면서 좌석 초기화 
							System.out.println("예매 불가능");
								seat[i] = 0;
								if(seat[i] == 0) {
									seatS[i] = "[ ]";
								}
						}else if(seat[i] == 1) {
							System.out.println("이미 예매 완료된 좌석입니다.");
						}else if(seat[i] == 0) {
							seat[seatNum] = 1;
							if(seat[i] == 1) {
								seatS[i] = "[O]";
							}
						}else {
							System.out.println("존재하는 좌석을 선택해주세요.");
						}
					}
				}else if(seatSelect >= 2) { // 2명보다 많을때
						System.out.println("현재 선택 가능한 좌석");
						if(seatSelect % 2 == 0) {
							for(int i = 0; i < seat.length; i++) {
								seat[seat.length - 1] = -1; // 마지막 좌석 선택 불가
								if(seat[i] == -1) {
									seatS[i] = "[X]";
								}
							}
						}
						for(int i = 0; i < seatS.length; i++) { // 선택 가능한 좌석 표시
							System.out.print(seatS[i]);
						}
						System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
						seatNum = scan.nextInt();
						if(seatSelect % 2 == 0) {
							if(seatNum == 7) {
								System.out.println("마지막 좌석은 선택할 수 없습니다.");
							}else if(seatSelect == 2){
								for(int i = 0; i < seat.length; i++) {
									seat[seatNum - 1] = 1;
									seat[seatNum] = 1;
									if(seat[i] == 1) {
										seatS[i] = "[O]";
										System.out.println(Arrays.toString(seat));
									}
									seat[seat.length - 1] = 0; // 마지막 좌석 X 되돌리기
									if(seat[i] == 0) {
										seatS[i] = "[ ]";
									}
								}
							}else if(seatSelect == 4) {
								for(int i = 0; i < seat.length; i++) {
									seat[seatNum - 1] = 1;
									seat[seatNum] = 1;
									if(seat[i] == 1) {
										seatS[i] = "[O]";
									}
									System.out.print(seatS[i]);
								}
								System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
								seatNum = scan.nextInt();
								for(int i = 0; i < seat.length; i++) {
									seat[seatNum - 1] = 1;
									seat[seatNum] = 1;
									if(seat[i] == 1) {
										seatS[i] = "[O]";
									}
									System.out.print(seatS[i]);
									seat[seat.length - 1] = 0; // 마지막 좌석 X 되돌리기
									if(seat[i] == 0) {
										seatS[i] = "[ ]";
									}
								}
							}
						}
					}
			}else if(menu == 2) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("1번과 2번 중 하나를 선택해주세요");
			}
			
		}
		

	}

}
