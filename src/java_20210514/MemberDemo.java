package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("asd123", "둘리1", 10);
		m.insert("asd456", "둘리2", 10);
		m.insert("asd789", "둘리3", 10);
		m.insert("asd000", "둘리4", 10);

		ArrayList list = m.select();
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", 
					m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===========");

		m.delete("asd123");
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", 
					m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===========");

		m.update("asd456", "둘리2", 10);

		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", 
					m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===========");

		Member m3 = m.select("asd000");
		System.out.printf("%s, %s, %d %n", 
				m3.getId(), m3.getName(), m3.getAge());
	}
}