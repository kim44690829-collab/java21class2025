package multiArrExample;

public class CompareTo_Example {

	public static void main(String[] args) {
		// CompareTo() 메서드는 String pool 과 전혀 상관없이 문자열의 내용만을 비교한다.
		// A.compareTo(B) => 결과는 0, 음수, 양수 로 출력
		// A == B => 0
		// A 와 B를 비교해서 A의 순서가 B의 앞이면(사전적으로 => 유니코드 혹은 아스키코드) 음수 출력
		// A 와 B를 비교해서 A의 순서가 B의 뒤이면(사전적으로 => 유니코드 혹은 아스키코드) 양수 출력
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		// 유니코드로 가 = 44032 / 나 = 45208
		int result1 = str1.compareTo(str2);
		System.out.println(result1); // -1176
		
		int result2 = str2.compareTo(str1);
		System.out.println(result2); // 1176
		
		int result3 = str1.compareTo(str3);
		System.out.println(result3); // 0
		
		if(result3 != 0) {
			System.out.println("같은 문자가 존재하지 않습니다.");
		}else {
			System.out.println("같은 문자입니다.");
		}
	}

}
