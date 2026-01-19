//package capitalGame;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class RunMain {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
////		Random ra = new Random();
//		Map<String, String> ga = new HashMap<String, String>();
////		String AAA = ra.
//		boolean run = true;
//		String run2 = "";
//		
//		ga.put("한국", "서울");
//		ga.put("일본", "도쿄");
//		ga.put("중국", "베이징");
//		ga.put("인도", "뉴델리");
//		ga.put("프랑스", "파리");
//		ga.put("미국", "워싱턴 D.C");
//		ga.put("호주", "캔버라");
//		ga.put("영국", "런던");
//		
//
//		
//		
//		System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");
//		while(run) {
//			System.out.print("A. 입력\tB. 퀴즈\tC. 종료 >> ");
//			String sel = scan.nextLine().toUpperCase();
//			if(sel.equals("A")) {
//				System.out.println("현재 " + ga.size() + "개 나라의 수도가 입력되어 있습니다.");
//				System.out.print("나라와 수도 입력 " + (ga.size() + 1) + " >> ");
//				String countryInput = scan.nextLine();
//				if(countryInput.equals("그만")) {
//					continue;
//				}
//				
//				StringTokenizer inputData = new StringTokenizer(countryInput);
//				String input1 =  inputData.nextToken();
//				String input2 =  inputData.nextToken();
////				System.out.println(input1 + " : " + input2);
//				// 이미 저장된 수도와 나라가 존재하면 예외처리
//				if(ga.containsKey(input1)) { // 같은 나라 존재 => true, 없으면 false
//					System.out.println("이미 존재합니다.");
//					continue;
//				}else {
//					ga.put(input1, input2);
//					continue;
//				}
//			}else if(sel.equals("B")) {
//				while(!run2.equals("그만")) {
//					System.out.println(ga + "의 수도는 ?");
//					String ans = scan.next();
//					if(ans.equals(ans)) {
//						
//					}else {
//						
//					}
//				}
//			}else if(sel.equals("C")) {
//				System.out.println("게임을 종료합니다.");
//				run = false;
//			}else {
//				System.out.println("A부터 C 사이의 번호를 선택해주세요.");
//			}
//		}
//		
//	}
//
//}
