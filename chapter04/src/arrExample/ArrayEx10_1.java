package arrExample;

import java.util.*;

public class ArrayEx10_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];

		boolean run = true; // while문 실행
		int seatNum = 0; // 선택한 좌석
		int price = 12000; // 티켓 하나의 가격
		int totalPrice = 0; // 총 가격
		
		while(run) {
			System.out.println(); // 한줄 공백
			System.out.println("현재 예매 가능한 좌석"); // 최초 예매 가능한 좌석
			
			for(int i = 0; i < seat.length; i++) { 
				if(seat[i] == 0) {
					System.out.print("[ ]"); // 선택 완료 좌석
				}else if(seat[i] == 2) {
					System.out.print("[X]"); // 선택 불가 좌석
				}else {
					System.out.print("[O]"); // 선택 가능 좌석
				}
			}
			
			System.out.println(); // 한줄 공백
			
			System.out.println("\n=== 메가 영화관 ==="); // 영화관 메뉴 시작
			System.out.print("1.좌석 예매\n2.종료\n메뉴 선택 : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("예매 인원을 입력하세요[1~7] : "); // 예매 인원 선택
				int seatSelect = scan.nextInt();
				if(seatSelect == 1) {
					System.out.println("현재 선택 가능한 좌석");
					for(int i = 0; i < seat.length; i++) {
						if((i+1) % 2 == 0) {
							seat[i] = 2;
						}
					}
					for(int i = 0; i < seat.length; i++) { 
						if(seat[i] == 0) {
							System.out.print("[ ]"); // 선택 완료 좌석
						}else if(seat[i] == 2) {
							System.out.print("[X]"); // 선택 불가 좌석
						}else {
							System.out.print("[O]"); // 선택 가능 좌석
						}
					}
					System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
					seatNum = scan.nextInt();
					if(2 == seat[seatNum - 1]) {
						System.out.println("선택 불가능한 좌석입니다.");
					}else{
						seat[seatNum - 1] = 1;
					}
					for(int i = 0; i < seat.length; i++) {
						if((i+1) % 2 == 0) {
							seat[i] = 0;
						}
					}
				}else if(seatSelect >= 2) {
					if(seatSelect % 2 == 0) {
						System.out.println("현재 선택 가능한 좌석");
						for(int i = 0; i < seat.length; i++) {
							seat[seat.length - 1] = 2; // 마지막 좌석 선택 불가
						}
						for(int i = 0; i < seat.length; i++) { // 좌석 배열
							if(seat[i] == 0) {
								System.out.print("[ ]"); // 선택 완료 좌석
							}else if(seat[i] == 2) {
								System.out.print("[X]"); // 선택 불가 좌석
							}else {
								System.out.print("[O]"); // 선택 가능 좌석
							}
						}
						for(int i = 0; i < seat.length; i++) {
							System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
							seatNum = scan.nextInt();
							if(seatNum == 7) {
								System.out.println("선택 불가 좌석입니다.");
							}
							
						}
					}
				}
			}else if(menu == 2) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("1,2번 중 하나를 선택해주세요.");
			}
		}
		
		
	}
}
