package classPart01;

public class Ex01 {
	// 멤버변수는 배열도 작성가능
	// 클래스는 데이터, 기능만 작성
	// 메인 메서드는 출력을 담당
	// int[] arr = {87, 100, 11, 72, 92};
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		int[] arr = {87, 100, 11, 72, 92};
//		int sum = 0;
//		for(int i = 0; i < ex01.arr.length; i++) {
//			sum += ex01.arr[i];
//		}
		// int result = ex01.sum();
		System.out.println(ex01.sum(arr));
		// System.out.println(sum);
	}
	
}
