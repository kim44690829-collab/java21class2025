package multiArrExample;

import java.util.Scanner;

public class String_Example01 {

	public static void main(String[] args) {
		
		// String 객체 데이터 타입은 new로 생성하여 작성하는 경우 Heap 메모리에 저장된다.
		// == 연산자는 참조타입의 값이 아니라 참조 주소를 비교한다. => new로 생성한 경우 주소가 달라서 불일치결과가 나온다.
		// equals()는 값을 비교한다. => new로 생성해서 달라진 주소 안으로 들어가 값을 비교해서 같으면 일치결과로 나타난다.
		String a = new String("hongpossible"); 
		String b = new String("hongpossible");
		
		// a 와 b의 물리적 주소 => 참조주소
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		if(a == b) {
			// 804564176 => a 주소
			// 1421795058 => b 주소
			// a와 b는 문자의 데이터 값은 같아도 서로 다른 참조주소를 가지고 있으므로 같지 않다
			System.out.println("a == b");
		}
		if(a.equals(b)) {
			System.out.println("a.equals(b) // true");
		}
		
		System.out.println();
		
		// 문자열 리터럴 이용하여 작성
		// 문자열 리터럴을 이용하여 작성하면 String pool에 저장됨
		// 같은 문자열이 String pool에 존재하면 새로 만들지 않고 기존 객체를 재사용함. => JVM이 자동으로 함.
		// 참조 주소가 같기 때문에 == 연산자를 이용해 비교해도 true가 출력
		String c = "hong";
		String d = "hong";
		
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		if(c == d) {
			System.out.println("c == d");
		}
		if(c.equals(d)) {
			System.out.println("c.equals(d) // true");
		}
		
		// Scanner의 next() 동작 방식은 키보드를 입력하면 String pool 을 사용하지 않고 새로운 String 객체를 Heap 에 생성한다.
		
		Scanner scan = new Scanner(System.in);
		// Scanner로 입력받은 숫자의 예외처리는 try ~ catch() 를 이용한다.
		// 키보드 또는 네트워크를 통해 가지고 오는 데이터의 오류는 컴퓨터가 알지 못함.
		// 그래서 try ~ catch()를 통해 오류 메시지를 전달한다. => 예외처리
		String name = "홍길동";
		System.out.print("이름 입력 : ");
		String str = scan.next();
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(str));
		
		if(name == str) {
			System.out.println("== 연산자 일치");
		}else {
			System.out.println("== 연산자 불일치");
		}
		
		if(name.equals(str)) {
			System.out.println("equals 일치");
		}else {
			System.out.println("equals 불일치");
		}
		
		
		
//		System.out.print("숫자를 입력하세요 : ");
//		try {
//			int num = scan.nextInt();
//		}catch(Exception e) {
//			System.out.println("숫자를 입력하세요르레히");
//		}
	}

}
