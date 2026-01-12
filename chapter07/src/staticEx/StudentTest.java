package staticEx;

import privateEx.PrivateTest;

public class StudentTest {

	public static void main(String[] args) {
		// 객체화
		Student st01 = new Student();
		
		// static으로 작성된 클래스 변수는 인스턴스화하지 않아도 접근 가능
		// Student.serialNum
		// System.out.println(st01.serialNum); // 1000
		// System.out.println(Student.serialNum); // 1000
		
		Student st02 = new Student();
		// st02.serialNum++;
		// 아무리 st02 참조변수 생성 다음에 serialNum을 누적해도 데이터 메모리 영역에서 값을 모든 참조변수에 공유하고 있음.
		// System.out.println(st02.serialNum); // 1001
		// System.out.println(st01.serialNum); // 1001
		
		System.out.println("st03 참조변수 ===============");
		Student st03 = new Student();
		System.out.println(st01.studentId);
		System.out.println(st02.studentId);
		System.out.println(st03.studentId);
		
		System.out.println();
		
		System.out.println("serialNum 값(공유) ===============");
		System.out.println(st01.serialNum);
		System.out.println(st02.serialNum);
		System.out.println(st03.serialNum);
		
		// static 클래스 변수는 객체화하지 않아도 접근 가능
		System.out.println("serialNum " + Student.serialNum);
		
		PrivateTest pt = new PrivateTest();
		pt.setDay(10);
		System.out.println(pt.getDay());
	}

}
