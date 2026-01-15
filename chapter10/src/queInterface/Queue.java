package queInterface;

public interface Queue {
	
	// Queue는 자료구조로 FIFO(first in first out)의 형식을 가짐
	// 처음에 입력한 데이터가 처음으로 출력된다는 의미
	void inQueue(String title); // 맨 뒤로 넣기
	
	String deQueue(); // 꺼내기
	int getSize(); 
}
