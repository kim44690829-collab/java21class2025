package hashMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Location> countryInfo = new HashMap<String, Location>();
		
		int cnt = 4;
		int count = 0;
		String run = "";
		
		System.out.println("도시, 경도, 위도를 입력하세요. ");
		while(count < 4) {
			System.out.print(">> ");
			String info = scan.nextLine();
			StringTokenizer counInfo = new StringTokenizer(info, ",");
			String name = counInfo.nextToken();
			int longitudeInfo = Integer.parseInt(counInfo.nextToken().trim());
			int latitudeInfo = Integer.parseInt(counInfo.nextToken().trim());
			countryInfo.put(name, new Location(name, longitudeInfo, latitudeInfo));
			count++;
		}
		
		System.out.println("-------------------------------");
		for(String in : countryInfo.keySet()) {
			Location inf = countryInfo.get(in);
			System.out.println(inf);
//			System.out.println(inf.getCountry() + " " + inf.getLongitude() + " " + inf.getLatitude() );
		}
		
		System.out.println("-------------------------------");
		while(!run.equals("그만")) {
			System.out.print("도시 이름 >> ");
			String name = scan.next().toUpperCase();
			if(name.equals("그만")) {
				run = "그만";
				System.out.println("정보 검색 종료");
			}else if(countryInfo.containsKey(name)) {
				Location inf02 = countryInfo.get(name);
				System.out.println(inf02.getCountry() + " " + inf02.getLongitude() + " " + inf02.getLatitude());
			}else {
				System.out.println(name + "는 없습니다.");
			}
		}
		// -----------------------------------------------------------------------------------------------------------
		
//		System.out.println("도시, 경도, 위도를 입력하세요. ");
//		for(int i = 0; i < cnt; i++) {
//			System.out.println(">>");
//			String loca = scan.nextLine();
//			StringTokenizer st = new StringTokenizer(loca,",");
//			String cityName = st.nextToken().trim();
//			// 나라이름은 문자, 경도 위도는 숫자이기에 파싱
//			
//			int longitude = Integer.parseInt(st.nextToken().trim());
//			int latitude = Integer.parseInt(st.nextToken().trim());
//			
//			// 객체화
//			Location lo = new Location(cityName, longitude, latitude);
//			
//			// countryInfo => put
//			countryInfo.put(cityName, lo);
//		}
//		
//		// countryInfo의 모든 정보 출력
//		for(String keyCity : countryInfo.keySet()) {
//			// Location이라는 객체를 데이터 타입으로 loca라는 참조변수에 참조값을 담았다. 
////			Location loca = countryInfo.get(keyCity);
//			System.out.println(countryInfo.get("가"));
				// 객체 데이터 타입을 지정한 경우 출력할 때 내부적으로 자동 toString()을 호출한다.
////			System.out.println(loca.toString());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}
}
