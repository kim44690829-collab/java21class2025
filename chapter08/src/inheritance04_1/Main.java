package inheritance04_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속을 받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.
		ArrayList<Customer> customerlist = new ArrayList<>();
		
		Customer cus01 = new Customer(1001,"이순신");
		Customer cus02 = new Customer(1002,"신사임당");
		GoldCustomer cus03 = new GoldCustomer(2001,"홍길동");
		GoldCustomer cus04 = new GoldCustomer(2002,"이율곡");
		VIPCustomer cus05 = new VIPCustomer(3001,"김유신", 1234);
		
		// 업캐스팅 => Customer 데이터 타입을 가진 ArrayList에 넣었기 때문
		customerlist.add(cus01);
		customerlist.add(cus02);
		customerlist.add(cus03);
		customerlist.add(cus04);
		customerlist.add(cus05);		
		
		System.out.println("====== 고객정보 출력 ======");
		for(int i = 0; i < customerlist.size(); i++) {
			System.out.println(customerlist.get(i).ShowCustomerInfo());
		}
		System.out.println();
		
		System.out.println("====== 보너스 포인트와 할인율 결과 ======");
		int price = 10000;
		for(int i = 0; i < customerlist.size(); i++) {
			int money = customerlist.get(i).calcPrice(price);
			System.out.println(customerlist.get(i).customerName + "님이 " + money + "를 지불하셨습니다.");
			System.out.println(customerlist.get(i).ShowCustomerInfo());
		}
        
	}

}


