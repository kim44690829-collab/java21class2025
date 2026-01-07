package methodClass;

public class Return02 {
	// 배열로 된 데이터 타입을 매개변수로 사용하는 함수 작성
	public int test(int[] arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		// cnt는 4의 배수의 개수를 반환
		return cnt;
	}
	
	public static void main(String[] args) {
		Return02 r = new Return02();
		int[] arr001 = {1, 3, 4, 5, 6, 8, 9, 10};
		// r.test(arr001);
		// r.test() 메서드는 4의 배수의 개수를 반환하는 함수로 만들었음.
		// 즉 내가 만든 배열에서 4의 배수에 해당하는 것의 개수를 출력하는것.
		System.out.println(r.test(arr001));
	}
}
