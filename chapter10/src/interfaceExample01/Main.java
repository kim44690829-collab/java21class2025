package interfaceExample01;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		
		NumberFormat num1 = NumberFormat.getInstance();
		
		Buyable buy = new Television("TV-samsung", "MV-2020", 509000);
		Buyable buy2 = new Refrigerator("MV-2020", "1등급" ,2000000);
		
		// Buyable[] by = {buy, buy2};
		// for문 가능
		
		System.out.println(buy.getName());
		System.out.println(buy.getMaker());
		System.out.println(buy.getModel());
		System.out.println(num1.format(buy.getPrice()));
		System.out.println("--------------------");
		System.out.println(buy2.getName());
		System.out.println(buy2.getMaker());
		System.out.println(buy2.getModel());
		System.out.println(num1.format(buy2.getPrice()));
		System.out.println("--------------------");
	}

}
