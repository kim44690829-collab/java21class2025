package exceTest;

public class MainClass05 {

	public static void main(String[] args) throws Exception {
		
//		MainClass05 main05 = new MainClass05();
//		try {
//			main05.firstMethod();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		firstMethod();
		System.out.println("예외 처리 연습");
		
	}

	// 메서드 생성
	// throws Exception => 예외 던지기
	// 자기 자신에서 예외처리를 하는 것이 아니라 자기자신을 호출하는 메서드로 예외처리를 넘기는 것
	// 만약 main() 메서드에서도 throws Exception으로 예외 던지기를 진행하면 JVM이 알아서 예외처리를 진행한다.
	public static void firstMethod() throws Exception {
		secondMethod();
	}
	public static void secondMethod() throws Exception {
		thirdMethod();
	}
	public static void thirdMethod() throws Exception {
		System.out.println("(10 / 0) : " + (10 / 0));
	}
	
}
