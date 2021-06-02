package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double) sum / 2;
		return avg;
	}

	// javac TryCatchDemo.java => compile
	// javac TryCatchDemo 10 20 30
	// Run configurations -> arguments -> program arguments
	// -> 10, 20
	// -> 10, a ->NumberFormatException
	// -> 10 -> ArrayIndexOutOfBoundsException
	// ->
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvgs(korean, english);

			System.out.printf("국어와 영어의 평균 점수는 %.1f 입니다.", average);

		} catch (NumberFormatException e) {
			// catch 블럭의 수행문을 만들때 2가지 형태로 코딩한다
			// 1. 에러 메세지를 출력(개발자) - 개발단계에서
			// 2. 에러 메세지를 출력(사용자) - 서비스단계에서

			e.printStackTrace();// error stack 모두 다 보고 싶은 경우
			// system.out.println(e.getMessage());// 에러 메세지만 보고 싶은 경우
			System.err.println("똑바로 해 !!");
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch 블럭의 수행문을 만들때 2가지 형태로 코딩한다
			// 1. 에러 메세지를 출력(개발자)
			// 2. 에러 메세지를 출력(사용자)

			// e.printStackTrace(); //error stack 모두 다 보고 싶은경우
			// system.out.println(e.getMessage());//에러 메세지만 보고 싶은 경우
			System.err.println("인자를 2개가 필요해!");
		} finally {
			System.out.println("무족건 수행되는 블럭 - finally");
		}
	}

}