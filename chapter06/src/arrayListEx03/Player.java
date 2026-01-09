package arrayListEx03;

import java.util.Scanner;

public class Player {
	String playerName;
	
	public Player() {};
	
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	// 자신의 차례의 단어 입력하는 Scanner 메서드
	public String sayWord(Scanner scan) {
		System.out.println(playerName + " >> ");
		return scan.next();
	}
	
}
