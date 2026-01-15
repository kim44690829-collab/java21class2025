package queInterface;

// Shelf가 Queue를 implements
// BookShelf가 Shelf를 extends
// 실무에서 많이 사용하는 방법
public class BookShelf extends Shelf implements Queue {

	@Override
	public void inQueue(String title) {
		// 맨 뒤에 넣기
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// 꺼내기 => 삭제
		return shelf.remove(0); // 제일 첫 번째 자료 삭제
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
