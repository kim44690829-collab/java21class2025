package diExample06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeverageMaker be = new BeverageMaker();
		be.makeBeverage(new Americano("아메리카노", "물 추가"));
		be.makeBeverage(new Latte("라떼", "우유 추가"));
		be.makeBeverage(new GreenTea("뜨거운 물 추가", "녹차 우리기"));
		be.makeBeverage(new OrangeJuice("오렌지 착즙", "주스와 착즙한 오렌지 즙 믹스"));
	}

}
