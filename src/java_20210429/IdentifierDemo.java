//패키지명도 식별자에 포함 되기 때문에 식별자 규칙을 지켜야 함
package java_20210429;

//클래스명도 식별자에 포함됨
//클래스명의 첫 글자는 대문자, 두 단어가 합쳐진 경우 두 번째 단어 첫 글자도 대문자
public class IdentifierDemo {
	// 매서드명도 식별자에 포함됨
	// 클래스명을 제외한 모든 이름은 소문자로 시작한다
	public static void main(String[] args) {
		int age = 20;
		// n은 이름변수(name)
		String n = "Hello";
		// 첫 글자는 숫자를 사용할 수 없음
		// String 1fatherName = "John";
		// 공백을 사용할 수 없음
		// String mother Name = "Michell";
		// 예약을 사용할 수 없음
		// String void = "empty";
		// 자바는 유니코드 지원하기 떄문에 한글도 식별자로 사용 가능 하지만 안쓰는게 좋음
		String 이름 = "임승현";

		System.out.println(이름);

	}
}