package privateEx;

public class MainClass {

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		
		// setter() => 값을 수정
		//pt.setDay(30);
		// getter() => 수정은 불가능하고 출력은 가능
		// System.out.println(pt.getDay());
		pt.setMonth(2);
		pt.setYear(2026);
		pt.setDay(30);
		System.out.println(pt.getDay());
		//System.out.println(pt.year = 2005);

	}

}
