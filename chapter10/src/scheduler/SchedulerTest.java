package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		// Scanner로 입력 => L, P, R => 각 클래스 앞글자
		Scanner scan = new Scanner(System.in);
		System.out.print("전화 상담 배분 방식을 선택하세요 (R, L, P) : ");
		// R 또는 r, P 또는 p, L 또는 l => 
		String ch = scan.next().toUpperCase();
		Scheduler sch = null;

		if(ch.equals("R")) {
			sch = new RoundRobin();
		}else if(ch.equals("L")) {
			sch = new LeastJob();
		}else if(ch.equals("P")) {
			sch = new PriorityAllocation();
		}else {
			System.out.println("다시 선택");
		}
		
		// 메서드 출력
		sch.getNextCall();
		sch.sendCallToAgent();
		sch.getLunch();
	}

}
