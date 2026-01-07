package methodClass;

public class ReturnClass {
	
	// 메서드 작성 연습
	// void로 메서드 작성 시 값을 반환할 수 없다. (return 불가)
	public void ReturnInt() {
		int k = 10;
	}
	
	// 데이터 타입으로 메서드 작성 시 반드시 값을 반환해야한다.
	public String ReturnString() {
		// return 이란 값을 호출한 곳으로 반환하여 돌려준다.
		return "자바";
	}
	
	
	public static void main(String[] args) {
		// 객체화 한다.
		ReturnClass rt = new ReturnClass();
		rt.ReturnInt(); // 값을 반환하지 않았기 때문에 출력하지 못한다.
		
		String res = rt.ReturnString(); // return으로 반환한 "자바"를 저장해서 res에 대입한다.
		System.out.println(res);
	}
}
