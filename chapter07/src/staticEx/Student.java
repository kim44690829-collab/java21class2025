package staticEx;

public class Student {
	// static은 데이터 메모리 영역에 존재 / 서로 다른 인스턴스에 같은 값을 공유한다.
	// static / 데이터 타입 / 변수이름 => 클래스변수라고 칭한다.
	// static은 정적이라는 의미를 가진다.
	static int serialNum = 1000;
	
	int studentId;
	String studentName;
	
	public Student() {
		serialNum ++;
		studentId = serialNum;
	};
}
