package queInterface;

public class BookTest {

	public static void main(String[] args) {
		
		// 업캐스팅
		Queue qShelf = new BookShelf();
		
		// 문자 삽입
		// ---------------------------------------------------------------------------------------
		// 나가는 방향(remove)    <---------        | A | B | C | D |     <------ 들어간 방향 (add)
		// ---------------------------------------------------------------------------------------
		qShelf.inQueue("A");
		qShelf.inQueue("B");
		qShelf.inQueue("C");
		qShelf.inQueue("D");
		
		// ArrayList<>는 삭제되고나면 뒤 데이터 앞으로 이동
		
		System.out.println(qShelf.deQueue()); // 제일 첫번째 자료를 삭제
		System.out.println(qShelf.deQueue());
		System.out.println(qShelf.deQueue());
		System.out.println(qShelf.deQueue());
		
		
	}

}
