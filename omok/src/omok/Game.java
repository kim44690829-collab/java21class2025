package omok;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	
	GameElements elements1 = new GameElements(); // 플레이어1 (흑)
	GameElements elements2 = new GameElements(); // 플레이어2 (백)

	int[][] omokPan = new int[13][13]; // 오목판 제작용
	//int[][] omokSel = new int[13][13]; // 오목판 모양 바꾸기용
	int count = 1; // 오목 순서 카운트용
	
	// 디폴트 생성자
	public Game() {};
	
	// 오목판
	public void omokPan() {
		for(int i = 0; i < omokPan.length; i++) {
			for(int j = 0; j < omokPan[i].length; j++) {
				if(omokPan[i][j] == 0) {
					//omokPan[i][j] = "●";
					System.out.print("- ");
				}else if(omokPan[i][j] == 1) {
					// omokPan[i][j] = "○";
					System.out.print("● ");
				}else {
					//omokPan[i][j] = "-";
					System.out.print("○ ");
				}
				//System.out.print(omokPan[i][j]);
			}
			System.out.println();
		}
	}
	
	// 오목판 초기화
	public void omokPanReset() {
		for(int i = 0; i < omokPan.length; i++) {
			for(int j = 0; j < omokPan[i].length; j++) {
				omokPan[i][j] = 0;
			}
		}
	}
	
	// main() 출력용 메서드
	public void menu() {
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("[오목]");
			System.out.print("[1]게임 시작\n[2]전적 확인\n[0]종료\n메뉴 선택 : ");
			int menuSel = scan.nextInt();
			if(menuSel == 1) {
				// 오목판 처음 보여주는 용
				omokPan();
				// 오목 게임 플레이
				omokGame();
				
			}else if(menuSel == 2) {
				System.out.println(elements1.player + " : " + elements1.win + "승 " + elements1.lose + "패");
				System.out.println(elements2.player + " : " + elements2.win + "승 " + elements2.lose + "패");
			}else if(menuSel == 0) {
				run = false;
				System.out.println("게임 종료");
			}else {
				System.out.println("0번부터 2번 사이의 번호를 선택해주세요.");
			}
		}
	}
	
	// 오목 게임 메서드
	public void omokGame() {
		elements1.player = "플레이어 1";
		elements2.player = "플레이어 2";
		boolean gameRun = true;
		System.out.println("오목 게임 시작 (플레이어 1 : 흑돌, 플레이어 2 : 백돌)");
		while(gameRun) {
			if(count % 2 == 1) {
				System.out.println(elements1.player + "차례 - 놓을 위치를 선택 (흑돌)");
				System.out.print("가로(1 ~ 13) : ");
				int player1LineSel = scan.nextInt() - 1;
				System.out.print("세로(1 ~ 13) : ");
				int player1RowSel = scan.nextInt() - 1;
				if(player1LineSel >= 13 || player1RowSel >= 13) {
					System.out.println("오목판은 13 X 13의 규격으로 제작되었습니다.");
				}else {
					if((omokPan[player1RowSel][player1LineSel] == 1) || (omokPan[player1RowSel][player1LineSel] == 2)) {
						System.out.println("이미 돌이 놓여있습니다.");
					}else {
						omokPan[player1RowSel][player1LineSel] = 1;
						//omokSel[player1RowSel][player1LineSel] = 1;
						count++;
						// 돌 놓은 후 오목판
						omokPan();
						if(rightLine5() || row5() || rightRow5() || leftRow5()) {
							System.out.println(elements1.player + "승리");
							System.out.println();
							elements1.win++;
							elements2.lose++;
							omokPanReset();
							count = 0;
							break;
						}
						
					}
				}
			}else {
				System.out.println(elements2.player + "차례 - 놓을 위치를 선택 (백돌)");
				System.out.print("가로(1 ~ 13) : ");
				int player2LineSel = scan.nextInt() - 1;
				System.out.print("세로(1 ~ 13) : ");
				int player2RowSel = scan.nextInt() - 1;
				if(player2LineSel >= 13 || player2RowSel >= 13) {
					System.out.println("오목판은 13 X 13의 규격으로 제작되었습니다.");
				}else {
					if((omokPan[player2RowSel][player2LineSel] == 1) || (omokPan[player2RowSel][player2LineSel] == 2)) {
						System.out.println("이미 돌이 놓여있습니다.");
					}else {
						for(int i = 0; i < omokPan.length; i++) {
							for(int j = 0; j < omokPan[i].length; j++) {
								omokPan[player2RowSel][player2LineSel] = 2;
								//omokSel[player2RowSel][player2LineSel] = 2;
							}
						}
						count++;
						// 돌 놓은 후 오목판
						omokPan();
						if(rightLine5() || row5() || rightRow5() || leftRow5()) {
							System.out.println(elements2.player + "승리");
							System.out.println();
							elements2.win++;
							elements1.lose++;
							omokPanReset();
							count = 0;
							break;
						}
					}
				}
			}
		}
	}
	
	// 패배 메서드
	// 가로 5개
	public boolean rightLine5() {
		for(int i = 0; i < omokPan.length; i++) {
			for(int j = 0; j < omokPan[i].length; j++) {
				if((j + 4) < 13) {
					if((omokPan[i][j] == 1 && omokPan[i][j+1] == 1 && omokPan[i][j+2] == 1 && omokPan[i][j+3] == 1 && omokPan[i][j+4] == 1) ||
						(omokPan[i][j] == 2 && omokPan[i][j+1] == 2 && omokPan[i][j+2] == 2 && omokPan[i][j+3] == 2 && omokPan[i][j+4] == 2)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	// 세로 5개
	public boolean row5() {
		for(int i = 0; i < omokPan.length; i++) {
			for(int j = 0; j < omokPan[i].length; j++) {
				if((i+4) < 13 && j > 0) {
					if((omokPan[i][j] == 1 && omokPan[i+1][j] == 1 && omokPan[i+2][j] == 1 && omokPan[i+3][j] == 1 && omokPan[i+4][j] == 1) ||
						(omokPan[i][j] == 2 && omokPan[i+1][j] == 2 && omokPan[i+2][j] == 2 && omokPan[i+3][j] == 2 && omokPan[i+4][j] == 2)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	// 우측 하위 대각선 5개
	public boolean rightRow5() {
		for(int i = 0; i < omokPan.length; i++) {
			for(int j = 0; j < omokPan[i].length; j++) {
				if((i+4) < 13 && (j+4) < 13) {
					if((omokPan[i][j] == 1 && omokPan[i+1][j+1] == 1 && omokPan[i+2][j+2] == 1 && omokPan[i+3][j+3] == 1 && omokPan[i+4][j+4] == 1) ||
						(omokPan[i][j] == 2 && omokPan[i+1][j+1] == 2 && omokPan[i+2][j+2] == 2 && omokPan[i+3][j+3] == 2 && omokPan[i+4][j+4] == 2)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	// 좌측 상위 대각선 5개
	public boolean leftRow5() {
		for(int i = 0; i < omokPan.length; i++) {
			for(int j = 0; j < omokPan[i].length; j++) {
				if((i+4) < 13 && (j-4) > 0) {
					if((omokPan[i][j] == 1 && omokPan[i+1][j-1] == 1 && omokPan[i+2][j-2] == 1 && omokPan[i+3][j-3] == 1 && omokPan[i+4][j-4] == 1) ||
						(omokPan[i][j] == 2 && omokPan[i+1][j-1] == 2 && omokPan[i+2][j-2] == 2 && omokPan[i+3][j-3] == 2 && omokPan[i+4][j-4] == 2)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
}
