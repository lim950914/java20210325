package p04.textbook;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if (score < 90) // {} 로 묶지 않았기 때문에 위에 코드블록만 if 실행됨
			System.out.println("점수가 90보다 작습니다.");
		
		System.out.println("등급은 B입니다");

	}
}