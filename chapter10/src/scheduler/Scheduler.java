package scheduler;

public interface Scheduler {
	void getNextCall(); // 다음 고객의 call을 가져오는 메서드
	void sendCallToAgent(); // 상담원에게 call을 던지는 메서드
	void getLunch(); // 점심시간
}
