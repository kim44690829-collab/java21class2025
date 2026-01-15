package interfaceExample03;

import java.util.Scanner;

public class Circle implements Shape {
	Scanner scan = new Scanner(System.in);
	int radius;
	double area;
	double pi = 3.14;
	
	public Circle() {
		radius = 0;
	}

	@Override
	public void draw() {
		System.out.print("반지름을 입력해주세요 : ");
		radius = scan.nextInt();
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		area = radius * radius * pi;
		return area;
	}
	
}
