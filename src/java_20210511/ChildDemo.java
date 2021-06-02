package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		Child child = new Child("010-1234-4567",72.3,180.2);
	
		System.out.println(child.name);
		System.out.println(child.address);
		System.out.println(child.age);
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child.height);
		System.out.println(child.name);

	Child child2 = 
			new Child("둘리","서울",23,"010-1234-4567",72.3,180.2);
	}
}
