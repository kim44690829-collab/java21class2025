package arrExample;

import java.util.*;

public class ArrayEx10_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];

		boolean run = true; // while문 실행
		int seatNum = 0; // 선택한 좌석
		int price = 12000; // 티켓 하나의 가격
		int count = 0; // 예약된 좌석을 세기 위한 변수
		int totalPrice = 0; // 총 가격
		boolean select = false;
		
		while(run) {
			System.out.println(); // 한줄 공백
			System.out.println(); // 한줄 공백
			System.out.println("현재 예매 가능한 좌석"); // 최초 예매 가능한 좌석
			
			for(int i = 0; i < seat.length; i++) { 
				if(seat[i] == 0) {
					System.out.print("[ ]"); // 선택 가능 좌석
				}else if(seat[i] == 2) {
					System.out.print("[X]"); // 선택 불가 좌석
				}else {
					System.out.print("[O]"); // 이미 선택 완료된 좌석
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
					if(!select) {
						for(int i = 0; i < seat.length; i++) {
							if(((i+1) % 2 == 0) && (seat[i] != 1)) {
								seat[i] = 2;
							}
						}
					}
					for(int i = 0; i < seat.length; i++) { 
						if(seat[i] == 0) {
							System.out.print("[ ]"); // 선택 가능 좌석
						}else if(seat[i] == 2) {
							System.out.print("[X]"); // 선택 불가 좌석
						}else {
							System.out.print("[O]"); // 이미 선택 완료된 좌석
						}
					}
					System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
					seatNum = scan.nextInt();
					if(2 == seat[seatNum - 1]) {
						System.out.println("선택 불가능한 좌석입니다.");
					}else if(seat[seatNum - 1] == 0){
						seat[seatNum - 1] = 1;
						count++;
						select = true;
					}else {
						System.out.println("이미 예약된 좌석입니다.");
					}
					for(int i = 0; i < seat.length; i++) {
						if(((i+1) % 2 == 0) && (seat[i] != 1)) {
							seat[i] = 0;
						}
					}
				}else if(seatSelect >= 2) {
					System.out.println("현재 선택 가능한 좌석");
					for(int i = 0; i < seat.length; i++) {
						if(seat[seat.length - 1] != 1) {
							seat[seat.length - 1] = 2; // 마지막 좌석 선택 불가
						}
					}
					for(int i = 0; i < seat.length; i++) { // 좌석 배열
						if(seat[i] == 0) {
							System.out.print("[ ]"); // 선택 가능 좌석
						}else if(seat[i] == 2) {
							System.out.print("[X]"); // 선택 불가 좌석
						}else {
							System.out.print("[O]"); // 이미 선택 완료된 좌석
						}
					}
					while(seatSelect >= 2) {
						System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
						seatNum = scan.nextInt();
						if(2 == seat[seatNum - 1]) {
							System.out.println("선택 불가능한 좌석입니다.");
						}else if(seat[seatNum - 1] == 0){
							seat[seatNum - 1] = 1;
							seat[seatNum] = 1;
							count += 2;
							seatSelect -= 2;
							select = true;
							if(seatSelect < 2) {
								for(int i = 0; i < seat.length; i++) {
									if(seat[seat.length - 1] != 1) {
										seat[seat.length - 1] = 0; // 마지막 좌석 선택 불가 해제
									}
								}
							}
							for(int i = 0; i < seat.length; i++) { // 좌석 배열
								if(seat[i] == 0) {
									System.out.print("[ ]"); // 선택 가능 좌석
								}else if(seat[i] == 2) {
									System.out.print("[X]"); // 선택 불가 좌석
								}else {
									System.out.print("[O]"); // 이미 선택 완료된 좌석
								}
							}
						}else {
							System.out.println("이미 예약된 좌석입니다.");
						}
						for(int i = 0; i < seat.length; i++) {
							if(seat[seat.length - 1] != 1) {
								seat[seat.length - 1] = 0; // 마지막 좌석 선택 불가 해제
							}
						}
					}
					while(seatSelect == 1) {
						System.out.print("\n좌석 번호 선택 : "); // 좌석 번호 선택
						seatNum = scan.nextInt();
						if(seat[seatNum - 1] == 0){
							seat[seatNum - 1] = 1;
							count++;
							seatSelect--;
							select = true;
						}else {
							System.out.println("이미 예약된 좌석입니다.");
						}
						for(int j = 0; j < seat.length; j++) { // 좌석 배열
							if(seat[j] == 0) {
								System.out.print("[ ]"); // 선택 가능 좌석
							}else if(seat[j] == 2) {
								System.out.print("[X]"); // 선택 불가 좌석
							}else {
								System.out.print("[O]"); // 이미 선택 완료된 좌석
							}
						}
					}
				}
			}else if(menu == 2) {
				System.out.println("예약을 완료합니다.");
				totalPrice = count * price;
				System.out.println("총 금액은 " + totalPrice + "원 입니다.");
				run = false;
			}else {
				System.out.println("1,2번 중 하나를 선택해주세요.");
			}
		}
		
		
	}
}
