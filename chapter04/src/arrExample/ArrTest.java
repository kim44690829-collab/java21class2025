package arrExample;

import java.util.Arrays;

public class ArrTest {

	public static void main(String[] args) {
		// 배열 선언 방법
		// 1. int[] arr = new int[3]; (정석)
		// 2. int arr[] = new int[3];
		
		// 선언한 배열에 초기값 지정하는 방식
		// 1. int[] arr01 = new int[]{1,2,3}; // int[] arr01 = new int[3]{1,2,3}; => 이와같이 []안에 방을 만들고 초기값도 같이 지정하면 오류 
		// 2. int[] arr01 = new int[3]; // 방 크기만 지정 후 초기화해도 상관없음.
		// 3. int[] arr01 = {1,2,3};
		// 배열 선언시 int[] arr = new int[] => 오류, 반드시 크기 입력
		
		// 배열의 특징
		// 1. 배열은 고정길이
		// 2. 배열은 삭제, 삽입 불가
		// 3. 배열은 중간에 값을 비워둘 수 없다. ex) {1, ,3}
		// 4. 배열은 생성과 동시에 메모리를 한번에 할당한다. => 그래서 1번과 같은 특징을 가진다.
		// 5. 배열은 단순한 자료구조이므로 가변기능은 컬렉션이 담당한다. ex) ArrayList, Linkedlist, Vactor, Stack...
		
		int[] arr = new int[3];
		// arr = {1,2};
		for(int i = 0; i < arr.length; i++) {
			// 정수형 배열에 초기값을 지정하지 않으면 0(기본값)이 출력
			System.out.println(arr[i]);
		}
		
		double[] doub = new double[3];
		for(int j = 0; j < doub.length; j++) {
			// 실수형 배열에 초기값을 지정하지 않으면 0.0(기본값)이 출력
			System.out.println(doub[j]);
		}
		
		String[] str = new String[3];
		String[] str02 = null;
		String[] str03 = null;
		// String[] str = {"가", "나", "다"};
		System.out.println(str.length); // 배열 길이 3
		System.out.println(Arrays.toString(str)); // 배열 요소 값 [null, null, null]
		System.out.println(str); // 배열 주소 @2ff4acd0
		
		// Arrays.copyOf(복사할 대상, 복사할 대상의 길이) => 객체 배열의 요소를 복사
		str02 = Arrays.copyOf(str, str.length); // str을 복사해서 값만 str02에 대입
		System.out.println(str02); // 배열주소 @54bedef2
		
		str03 = str; // 복사가 아니라 대입
		System.out.println(str03); // 배열 주소 @2ff4acd0
		
		for(int k = 0; k < str.length; k++){
			// 객체 배열에 초기값을 지정하지 않으면 null(기본값)이 출력 -> String 뿐만 아니라 모든 객체
			// str이 null이면 '난 배열값'으로 출력하고, null이 아니면 자기 자신 값 출력
			// String 객체는 비교할 때 equals()를 사용하지만 null이 객체가 아니므로 메서드를 사용하지 못함. str[k].equals(null) => 오류
			// str[k] == null 사용해야함
			if(str[k] == null) {
				System.out.println("난 배열값");
			}else {
				System.out.println(str[k]);
			}
//			System.out.println(str[k]);
		}
	}

}
