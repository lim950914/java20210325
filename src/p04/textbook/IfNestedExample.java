package p04.textbook;

public class IfNestedExample {
	public static void main(String[] args) {
		// 밑에서 20은 0 1 2 ..... 18 19
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}
