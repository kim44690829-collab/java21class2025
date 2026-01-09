package arrayListTest;

import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) {
		// ArrayList<E> 참조 변수 = new ArrayList<>(); => 형식
		// <E> => 제네릭(Generic) 이라고 부르며 데이터 타입이 "★클래스"로 작성되어야한다.
		// ArrayList<>는 가변길이 클래스 배열이다.
		// 데이터가 삭제되거나 추가되면 자동으로 배열의 크기가 변한다.
		// ArrayList<>에서 데이터 추가 메서드 : add(인덱스 번호, 값) 혹은 add(값)으로 작성 가능
		// add(값) => 항상 마지막에 추가 / add(인덱스 번호, 값) => 인덱스 번호 위치에 값이 추가되며 그 뒤에 있는 모든 데이터의 인덱스 번호가 뒤로 밀린다.
		// ArrayList<>에서 데이터 삭제 메서드 : remove(인덱스번호) => 단 삭제시 삭제한 데이터의 뒤의 있는 모든 데이터의 인덱스번호가 앞으로 당겨진다.
		// ArrayList<>에서 데이터 추출 메서드 : get(인덱스 번호) => 인덱스 번호를 쓰지 않거나 get을 쓰지 않으면 데이터를 추출할 수 없음.
		// ArrayList<>에서 배열의 길이를 추출하는 메서드는 size() => langth 아님 ★
		// ArrayList<>에서 요소가 비어있는지 확인하는 메서드는 isEmpty()이다. => 참-비어있다(true) / 거짓-들어있다(false)
		
		ArrayList<String> list = new ArrayList<>(); // ArrayList<String> list = new ArrayList<String>(); 의 우측 제네릭은 써도 괜찮고 안써도 괜찮고 
		ArrayList<String> list2 = new ArrayList<>();
		// ArrayList<E>의 <E>(제네릭)에 데이터 타입이 클래스 이어야 함으로 기본 데이터 타입인 int를 사용하지 못하고 Integer를 사용해야한다.
		ArrayList<Integer> num = new ArrayList<>();
		
		// 데이터 추가
		// list
		list.add("사과");
		list.add("바나나");
		list.add(1,"딸기");
		list.add(1,"포도");
		// list2
		list2.add("시금치");
		list2.add("콩나물");
		// list.add(""); // 빈값을 add해도 삽입한것으로 된다.
		// num
		num.add(20);
		num.add(30);
		
		// list2의 요소를 list로 통째로 추가하고 싶을때 addAll()을 사용 
		list.addAll(list2);

		// 데이터 삭제
		list.remove(1);
		
		// 일반적인 for문 전체 출력 => get 사용 필수
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 확장 for문 => for(데이터 타입 + 변수이름(작명) : 참조변수)
		// list의 확장 for문
//		for(String li : list) {
//			System.out.println(li); // get을 못쓰는 이유 => 확장 for문은 인덱스값을 안가져가기때문에
//		}
		
		// num의 확장 for문
//		for(Integer n : num) {
//			System.out.println(n); // get을 못쓰는 이유 => 확장 for문은 인덱스값을 안가져가기때문에
//		}
		
		// System.out.println(list.isEmpty()); // 아무것도 삽입하지 않았을 때는 true 로 출력
		
		// -----------------------------------------------------------------------------------------------------------------------------------------
		// 내가 만든 클래스를 ArrayList<>의 데이터 타입으로 사용
		ArrayList<Member> meminfo = new ArrayList<>();
		// Member mem = new Member("홍길동", "서울", 20);
		Member mem = new Member();
		mem.name = "홍길동";
		mem.address = "서울";
		mem.age = 20;
//		public Member(String name, String address, int age) {
//			// this는 Member 클래스를 지칭한다.
//			this.name = name;
//			this.address = address;
//			this.age = age;
//		}
		// main() 메서드에서 생성할 때 입력한 매개변수의 값이
		// this.name = "홍길동";
		// this.address = "서울";
		// this.age = 20;
		
		//meminfo.add(new Member("홍길동", "서울", 20));
		meminfo.add(mem);
		meminfo.add(new Member("개나리", "인천", 25));
		
		for(Member m : meminfo) {
			// m.printMember();
			System.out.println("이름 : " + m.name + " 주소 : " + m.address + " 나이 : " + m.age);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
