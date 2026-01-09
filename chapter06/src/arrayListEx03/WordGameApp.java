package arrayListEx03;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		ArrayList<Player> player = new ArrayList<>();
//		
//		int count = 0;
//		int turn = 0;
//		
//		boolean run = true;
//		boolean playerRun = true;
//		
//		String word1 = "아버지";
//		
////		System.out.println(startWord.charAt(startWord.length() - 1));
////		System.out.println(startWord.charAt(0));
//		
//		while(playerRun) {
//			System.out.print("참가자 수를 입력하세요 : ");
//			count = scan.nextInt();
//			if(count == 1) {
//				System.out.println("참가자는 두명 이상부터 시작할 수 있습니다.");
//			}else {
//				for(int i = 0; i < count; i++) {
//					System.out.print( (i + 1) + "번 참가자 이름 : ");
//					String playerName = scan.next();
//					player.add(new Player(playerName));
//				}
//				playerRun = false;
//			}
//		}
//		// System.out.println(player.get(0).playerName);
//		
//		System.out.println("게임 시작!");
//		System.out.println();
//		System.out.println("현재 단어 : " + word1);
//		while(run) {
//			Player players = player.get(turn);
//			System.out.print(players.playerName + " >> ");
//			String word2 = scan.next();
//			if(word1.charAt(word1.length() - 1) != word2.charAt(0)) {
//				System.out.println("게임 종료!");
//				System.out.println("진 참가자 : " + players.playerName);
//				run = false;
//			}
//			word1 = word2;
//			if(turn == count - 1) {
//				turn = 0;
//			}else {
//				turn++;
//			}
//		}
		
		// --------------------------------------------------------------------------------------------------------------
		Scanner scan = new Scanner(System.in);
		ArrayList<Player> player = new ArrayList<>();
		System.out.print("참가자 수를 입력하세요 : ");
		int count = scan.nextInt(); // 참가자 수
		
		// 참가자 생성
		for(int i = 0; i < count; i++) {
			System.out.println((i+1) + "번 참가자 이름 : ");
			String playerName = scan.next();
			// ArrayList<>에 추가하는 함수 add()
			player.add(new Player(playerName));
		}
		System.out.println();
		System.out.println("게임 시작!");
		
		String word1 = "아버지";
		System.out.println("현재 단어 : " + word1);
		
		// [1] => [2] => [3]
		int turn = 0;
		while(true) {
			// Player => 데이터 타입
			// ArrayList에서 내가 원하는 인덱스의 값을 추출하는 메서드 get(index)
			Player currentPlayer = player.get(turn);
			String word2 = currentPlayer.sayWord(scan);
			
			// 한 음절 => char
			char lastChar = word1.charAt(word1.length() - 1);
			char firstChar = word2.charAt(0);
			
			if(lastChar != firstChar) {
				System.out.println("게임 종료!");
				System.out.println("진 참가자 : " + currentPlayer.playerName);
				break;
			}
			// 단어 교체
			word1 = word2;
			
			turn++;
			
			// 순서가 끝나면 다시 처음으로 초기화
			if(turn == player.size()) {
				turn = 0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
