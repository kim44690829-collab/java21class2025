package arrayListEx02;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Student 클래스를 ArrayList<>로 생성한다.
		ArrayList<Student> list = new ArrayList<>();
		
		// 학생 3명 입력 => while 문 돌리기 위한 변수
		int run = 0;
		
		while(run < 3) {
			Student sName = new Student();
			System.out.print("학생 이름을 입력하세요 : ");
			// Student 클래스의 name 멤버변수에 접근하여 이름을 입력
			sName.name = scan.next();
			
			// 과목, 성적 2번씩 입력
			for(int i = 0; i < 2; i++) {
				// Subject 클래스를 인스턴스화하여 sub에 접근하여 과목명 입력
				Subject subject = new Subject();
				System.out.println("과목명 입력 : ");
				subject.sub = scan.next();
				
				System.out.println("점수 입력 : ");
				subject.score = scan.nextInt();
				
				// Student 클래스 안에 과목, 점수 추가
				sName.subList.add(subject);
			}
			list.add(sName);
			
			run++;
		}
		System.out.println("===== 학생 성적 출력 =====");
		for(int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println("학생 이름 : " + s.name);
			for(int j = 0; j < s.subList.size(); j++) {
				Subject sub = s.subList.get(j);
				System.out.println("과목명 : " + sub.sub + ", 점수 : " + sub.score);
			}
		}
		
	}

}
