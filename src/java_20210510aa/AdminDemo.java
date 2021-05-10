package java_20210510aa;
import java_20210510.Admin;
public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin("kikiki","123","kikiki@naver.com",20);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		
		Admin a1 = new Admin();
		a1.setId("kikiki");
		a1.setPwd("123");
		a1.setEmail("kikiki@naver.com");
		a1.setLevel(20);
	}
	
	

}
