package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요 ex) korea 5000");
		System.out.println("그만이라고 입력하면 프로그램을 종료합니다.");
		
		String run = "";
		String run2 = "";
		
		while(run != "그만") {
			System.out.print("나라 이름, 인구 >> ");
			String country = scan.nextLine();
			if(country.equals("그만")) {
				run = "그만";
			}else {
				StringTokenizer str = new StringTokenizer(country);
				String counStr = str.nextToken();
				Integer parStr = Integer.parseInt(str.nextToken());
				nations.put(counStr, parStr);
			}
		}
		
		while(run2 != "그만") {
			System.out.print("인구 검색 >> ");
			String countrySearch = scan.next();
			if(countrySearch.equals("그만")) {
				run2 = "그만";
			}else if(nations.containsKey(countrySearch)){
				System.out.println( countrySearch + "의 인구는 " + nations.get(countrySearch) );
			}else {
				System.out.println("데이터에 없는 나라입니다. 나라를 다시 입력해주세요.");
			}
		}
		System.out.println("인구 검색 종료");

	}

}
