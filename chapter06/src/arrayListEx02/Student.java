package arrayListEx02;

import java.util.ArrayList;

public class Student {
	// 멤버 변수 => 학생 이름
	String name;
	
	// 멤버 변수
	// ArrayList<Subject> subList = new ArrayList<>();
	ArrayList<Subject> subList;
	
	// 디폴트 생성자
	public Student() {
		subList = new ArrayList<>();
	};
	
}
