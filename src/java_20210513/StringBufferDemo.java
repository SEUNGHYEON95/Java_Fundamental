package java_20210513;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("hello");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1);

		String str1 = s1.toString();
		String str2 = s2.toString();

		System.out.println(str1.equals(str2));

		StringBuffer sq1 = new StringBuffer();
		sq1.append("select name, age ");
		sq1.append("from member ");
		sq1.append("where name = '둘리' ");

		System.out.println(sq1);
		// sq1의 모든 문자열 지우기
		// sq1.setLength(0);

		sq1.append("select no, writer from board");
		System.out.println(sq1);
	}
}
