package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		// Map<key, value> : 자바의 collection의 프레임워크의 일종
		// Map의 특징
		// 1. 반드시 key, value값의 쌍으로 이루어져있다.
		// 2. key는 중복을 허용하지 않는다. => 중복된 키가 put되면 덮어씌우는 방식으로 제거
		// 3. value는 중복을 허용한다.
		// key를 이용하여 value를 저장하거나 검색, 삭제할 때 사용하면 유용하다.
		// Map의 종류 : HashMap, HashTable, TreeMap, Properties 등이 존재한다.
		// Map 인터페이스 메서드 : put[key, value] => key와 value를 삽입하는 메서드
		// Map은 반드시 import해야한다.
		
		// Map<> 의 <>는 제네릭 이라고 한다.
		// Map<K, V> => K : 래퍼클래스 (String, Integer, Double), 직접 만든 클래스 ex)Member, Product 등
		// HashMap은 Map의 하위 클래스이므로 데이터 타입을 부모인 Map으로 업캐스팅 할 수 있다.
		Map<String, String> list = new HashMap<>();
		// 생성한 객체의 list => 참조변수
		// HashMap<String, String> list02 = new HashMap<String, String>(); => 이건 가능
		// Map<String, String> list03 = new Map<String, String>(); => Map은 인터페이스라서 객체화 불가능
		
		System.out.println(list);
		
		// list.put(key[i], value[i])
		String[] key = {"a", "b", "c", "d", "e"};
		String[] value = {"apple", "banana", "candy", "dog", "enum"};
		
		for(int i = 0; i < key.length; i++) {
			// list 참조변수에 put() 메서드를 사용가능한 이유
			// => HashMap 객체를 생성하고 데이터 타입은 Map이기 때문에 Map인터페이스의 메서드에 모두 접근할 수 있다. 
			list.put(key[i], value[i]);
		}
		
		// 출력
		// HashMap은 비선형 자료구조이다.
		// HashMap은 순서가 보장되지 않는다. 그래서 입력도 순서가 없고 저장도 순서가 없다.
		// HashMap은 HashTable에 저장된다. 
		System.out.println(list);
		
		// keySet() => key 값을 출력, values() => value 값을 출력
		System.out.println("---------------");
		System.out.println(list.keySet()); // [a, b, c, d, e]
		System.out.println(list.values()); // [apple, banana, candy, dog, enum]
		
		// get(key) 메서드 => get(key) 의 (key) 는 현재 출력하고 싶은 key값을 입력 => 그에 해당하는 value를 출력해준다.
		System.out.println("---------------");
		// list.get("c") => 키 값이 "c"에 해당하는 value값이 출력
		System.out.println(list.get("c")); // candy
		System.out.println(list.get(key[0])); // apple
		System.out.println(list.get("apple")); // null
		System.out.println(list.get(list)); // null
		
		// replace() : key 값과 바꿀 값을 제공하면 해당 키의 값이 변경된다.
		System.out.println("---------------");
		list.replace("c", "code");
		System.out.println(list.get("c")); // code
		
		// 이미 존재하는 같은 key에 해당하는 value를 새로운 값으로 덮어씀
		System.out.println("---------------");
		list.put("c", "candy");
		System.out.println(list.get("c")); // candy
		
		// 추가 f , float
		System.out.println("---------------");
		list.put("f", "float");
		System.out.println(list);
		
		// containsKey(), containsValue() => key나 value가 존재하는지 확인 => 결과 true, false
		System.out.println("---------------");
		boolean isCheck;
		isCheck = list.containsKey("x");
		System.out.println(isCheck); // false
		
		boolean isCheckValue;
		isCheckValue = list.containsValue("apple");
		System.out.println(isCheckValue); // true
		
		// remove() => remove(key) => 제공한 key값의 항목만 삭제
		// clear() => 전체 삭제
		System.out.println("---------------");
		list.remove("c"); // {a=apple, b=banana, d=dog, e=enum, f=float}
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
				
		System.out.println("---------------");
		for(int i = 0; i < key.length; i++) {
			// list 참조변수에 put() 메서드를 사용가능한 이유
			// => HashMap 객체를 생성하고 데이터 타입은 Map이기 때문에 Map인터페이스의 메서드에 모두 접근할 수 있다. 
			list.put(key[i], value[i]);
		}
		System.out.println("--------- 확장 for문 이용 출력 ---------------");
		// for(데이터 타입  / 작명 : 참조변수)
		// key = {"a", "b", "c", "d", "e"}
		for(String li : list.keySet()) {
			// System.out.println(li);
			System.out.println(li + " : " + list.get(li));
		}
		
		System.out.println("--------- Iterator() 메서드 ---------------");
		// collection 또는 Map에서 사용하는 객체 순회 메서드
		// Set<데이터 타입>
		// keyset = {"a", "b", "c", "d", "e"}
		Set<String> keyset = list.keySet();
		Iterator<String> ir = keyset.iterator();
		// ir = {"a", "b", "c", "d", "e"}
		while(ir.hasNext()) { // 다음의 key가 존재하면 true, 아니면 false
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k + " : " + v);
		}
	}

}
