import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// ArrayList : 배열의 확장, 좀더 사용성이 좋아진 배열 => 일괄처리 , 반복문, 인덱스
		// HashMap : 객체와 비슷 , 데이터에 이름을 붙여서 관리 => 구조화, 데이터이름(키)-데이터(밸류)

		// 사람 구조화

		// 1. 선언
		HashMap<String, Object> personMap = new HashMap<>();
		// 2. 저장 = put(Key, Value)
		personMap.put("age", 20);
		personMap.put("name", "홍길동");

		// 3.가져오기 ________ value가 Object이기 때문에 형변환 (String)을 해준것
		String str1 = (String) personMap.get("name");
		int age = (int) personMap.get("age");

		System.out.println(age + str1);

		// 4. 수정
		personMap.put("age", 50);

		System.out.println(personMap.get("age") + str1);

		// 5. 삭제
		personMap.remove("name");
		System.out.println(personMap.get("name"));

		// 6. 데이터 개수
		System.out.println(personMap.size());
	}

}

class Person {
	int age;
	String name;
}
