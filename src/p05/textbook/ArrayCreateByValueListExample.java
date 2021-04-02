package p05.textbook;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87}; // new int[]가 생략됨
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[0] : " + scores[1]);
		System.out.println("scores[0] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
