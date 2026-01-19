package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> studentList = new HashMap<String, Double>();
		int count = 0;
		
		System.out.println("미래 장학금 관리 시스템 입니다.");
		while(count < 5) {
			System.out.print("이름과 학점 >> ");
			String nameAndScore =  scan.nextLine();
			StringTokenizer str = new StringTokenizer(nameAndScore);
			String name = str.nextToken().trim();
			Double score = Double.parseDouble(str.nextToken().trim());
			if(score > 4.5) {
				System.out.println("최대값은 4.5 입니다.");
			}else {
				studentList.put(name, score);
				count++;
			}
		}
		
//		for(int i = 0; i < 5;) {
//			System.out.print("이름과 학점 >> ");
//			String nameAndScore =  scan.nextLine();
//			StringTokenizer str = new StringTokenizer(nameAndScore);
//			String name = str.nextToken().trim();
//			Double score = Double.parseDouble(str.nextToken().trim());
//			
//			if(score < 0 || score > 4.5) {
//				System.out.println("학점  : 0.0 ~ 4.5");
//				continue;
//			}
//			
//			studentList.put(name, score);
//			i++;
//		}
		
		System.out.print("장학생 선발 학생 기준 입력 >> ");
		double standard = scan.nextDouble();
		System.out.print("장학생 명단 : ");
		for(String st : studentList.keySet()) {
			if(standard <= studentList.get(st)) {
				System.out.print(st + " ");
			}
		}
	}

}
