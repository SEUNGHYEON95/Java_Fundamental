package java_20210503;

public class ForDemo1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 100까지 합은 %d 입니다.%n", sum);
	}

}