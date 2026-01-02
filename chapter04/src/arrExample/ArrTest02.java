package arrExample;

public class ArrTest02 {

	public static void main(String[] args) {
		
		int size = 0;
//		double[] data = new double[5];
		// data[0] = 10.0; size++;
		// data[1] = 20.0; size++;
		// data[2] = 30.0; size++;
		
		double[] data = {10.0, 20.0, 30.0, 0.0, 0.0};
		// double[] data = {10, 20, 30, 0, 0};
		
		// int total = 1;
		
		// data.length가 5이고, 초기값은 인덱스 0,1,2만 지정
		// 나머지는 0.0이기 때문에 뭐를 곱해도 0이 나옴
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
