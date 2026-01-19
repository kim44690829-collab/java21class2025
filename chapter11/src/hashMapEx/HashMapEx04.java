package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> member = new HashMap<String, Integer>();
		
		System.out.println("**  포인트 관리프로그램입니다. **");
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String nameAndPoint = scan.nextLine();
			if(nameAndPoint.equals("그만")) {
				System.out.println("포인트 관리 종료");
				break;
			}
			
			StringTokenizer str = new StringTokenizer(nameAndPoint);
			String name = str.nextToken().trim();
			Integer point = Integer.parseInt(str.nextToken().trim());

			Integer stPoint = member.get(name);
			if(member.containsKey(name)) {
				point += stPoint;
			}
			
			member.put(name, point);
			for(String st : member.keySet()) {
				System.out.print("("+ st + " , " + member.get(st) + ") ");
			}
			System.out.println();
		}
		
	}

}
