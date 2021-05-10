package java_20210503;

public class WhileDemo {

	public static void main(String[] args) {
		int first = 2;
		while (first <= 9) {
			System.out.printf("1부터 10까지의 합은 %d 입니다.", first);
			int second = 1;
			while (second <= 9) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
				second++;
			}
			first++;
		}
	}

}