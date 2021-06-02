package java_20210511.step1;

//요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요
//요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요
public class FootNanoStopWatch {
	long startTime;
	long endTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000_000_000;
	}

	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		// 1970년 1월 1일 부터 현재까지의 시간을 밀리세컨드로 반환
		f.startTime = System.nanoTime();

		for (long i = 0; i < 30_000_000_000l; i++) {

		}

		f.endTime = System.nanoTime();
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);
	}

}