package p04.textbook.exercise;

public class Exercise04 {
	public static void main(String[] args) {

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if (5 == num1 + num2) {
				break;
			}
		}
	}
}
