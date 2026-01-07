package classPart;

// Student 라는 이름을 가진 클래스를 생성했다.
public class Student {
	// property 또는 필드명 또는 멤버변수를 작성
	// 단, 데이터 타입은 자료의 형태를 보고 결정
	int studentId; // 학번
	String studentName; // 이름
	String address; // 주소
	int grade; // 학년
	
	// method 또는 함수 생성
	// 접근 제어자, 반환의 유무(void or 데이터 타입), 함수 이름(){}
	// 단, 반환할 값이 필요할 경우 반드시 return 반환값이 필요하다.
	public void showStudentInfo() {
		System.out.printf("%s학생의 주소는 %s이다.", studentName, address); 
		System.out.println();
	}
	
	// main() 메서드를 생성해서 출력
	public static void main(String[] args) {
		// 홍길동 개나리 진달래 학생의 정보를 출력
		// 반드시 먼저 진행해야 하는 작업 => 인스턴스화
		
		// st01,st02 등은 객체이다.
		Student st01 = new Student(); // 인스턴스
		st01.studentName = "홍길동";
		st01.address = "서울";
		st01.showStudentInfo();
		
		Student st02 = new Student();
		st02.studentName = "개나리";
		st02.address = "경기도";
		st02.showStudentInfo();
		
		System.out.println(st01);
		System.out.println(st02);
	}
}
