package hashMapEx;

public class Location {
	private String country;
	private int longitude; // 경도
	private int latitude; // 위도
	
	public Location() {}
	
	public Location(String country, int longitude, int latitude) {
		this.country = country;
		this.longitude = longitude; // 경도
		this.latitude = latitude; // 위도
	}
	
	public String getCountry() {
		return country;
	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
	public int getLatitude() {
		return latitude;
	}
//	public void setLatitude(int latitude) {
//		this.latitude = latitude;
//	}
	public int getLongitude() {
		return longitude;
	}
//	public void setLongitude(int longitude) {
//		this.longitude = longitude;
//	}
	
	// 자바의 최상위 클래스 Object 이다.
	// Object -> toString() => String 데이터 타입으로 출력할 때 사용
	// Ctrl + T => 현재 메서드의 최상위 클래스 확인
	@Override
	public String toString() {
		return country + " : " + longitude + " : " + latitude;
	}
	
//	public String toString() {
//    	return getClass().getName() + "@" + Integer.toHexString(hashCode());
		// => 기본 toString
//	}
	
}
