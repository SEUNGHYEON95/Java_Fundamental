package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Member m = new Member();
		//m.name = "스타벅스";
		m.setName("스타벅스");
		m.setEmail("star@bucks.aa");
		m.setZipcode("157305");
		m.setAddr1("남산타워");
		m.setAddr2("돈까스마을");
		m.setAge(32);
		print (m);
		//print(name,email,zipcode,addr1,addr2,age);

		
	}
	
}
