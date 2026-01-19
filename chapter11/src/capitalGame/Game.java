package capitalGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	// HashMap<>은 순서가 존재하지 않는다. => 저장도 순서가 없다.
	HashMap<String, String> ga = new HashMap<String, String>();
	
	// 생성자
	// 자바는 저장하고 컴파일하면 JVM이 제일 먼저 로드하는 것은 디폴트 생성자이다.
	public Game() {
		addNation();
	}
	
	// 나라 이름, 수도 저장하는 메서드
	public void addNation() {
		ga.put("한국", "서울");
		ga.put("일본", "도쿄");
		ga.put("중국", "베이징");
		ga.put("인도", "뉴델리");
		ga.put("프랑스", "파리");
		ga.put("미국", "워싱턴DC");
		ga.put("호주", "캔버라");
		ga.put("영국", "런던");
	}
	
	// Game menu 메서드
	public void gameMenu() {
		boolean run = true;
		System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");
		
		while(run) {
			System.out.print("1. 입력\t2. 퀴즈\t3. 종료 >> ");
			// 숫자만 읽고 엔터(\n)를 남김 
			int select = scan.nextInt();
			
			switch(select) {
			case 1: 
				// 게임 나라, 수도 삽입
				insertNation();
			break;
			case 2: 
				// 게임 스타트
				gameStart();
			break;
			case 3:
				// 게임 종료
				System.out.println("게임을 종료합니다.");
				run = false;
			
			break;
			}
		}
	}
	
	// 게임 나라, 수도 삽입
	public void insertNation() {
//		int cnt = ga.size();
		// 입력을 문자를 받아야함 => scan.nextint() 의 이슈인 \n이 남는 상황 제거
		scan.nextLine(); // 이전 입력 버퍼 정리
		System.out.println("현재 " + ga.size() + "개 나라의 수도가 입력되어 있습니다.");
		
		while(true) { // while(true) => 무한 루프
			System.out.print("나라와 수도 입력 " + (ga.size() + 1) + " >> ");
			String nation = scan.nextLine();
			// 그만이라 입력하면 삽입종료
			if(nation.equals("그만")) break;
			// 입력된 문자를 구분자를 기준으로 잘라서 담아주는 클래스
			StringTokenizer st = new StringTokenizer(nation);
			// 한국 서울 => 한국 / 서울 과 같이 분리 (스페이스바 기준)
			String na = st.nextToken().trim();
			String ca = st.nextToken().trim();
			
			// 이미 저장된 수도와 나라가 존재하면 예외처리
			if(ga.containsKey(na)) { // 같은 나라 존재 => true, 없으면 false
				System.out.println("이미 존재합니다.");
				continue;
			}
			
			// hashMap<> 저장
			ga.put(na, ca);
		}
	}
	
	// 게임 스타트 메서드
	// 삽입한 나라 이름을 배열로 전환
	// 삽입된 나라 이름이 랜덤하게 문제에 출제
	
	public void gameStart() {
		while(true) {
			// ArrayList<>의 매개 변수로 hashCaoital.keySet()의 나라를 사용
			ArrayList<String> nations = new ArrayList<String>(ga.keySet());
			System.out.println(ga.keySet()); // => [한국, 중국, 일본 ...]
			// 랜덤하게 나라이름 출력되는 문제
			int index = ran.nextInt(ga.size());
			// nations.get(index) => get()은 ArrayList<>의 메서드로 추출한느 역할
			// q => 한국
			String q = nations.get(index);
			// ans => ga.get("한국") => key 값이 "한국"인 value값을 출력 
			String ans = ga.get(q);
			
			System.out.print(q + "수도는 ? ");
			String myAns = scan.next();
			
			if(myAns.equals("그만")) {
				break;
			}else if(myAns.equals(ans)) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
				continue;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
