package p04.textbook;

public class ForSumFromTo100Example1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100 ; i++) {
			sum += i;
		}   // sum 에 i = 1, i = 2, i = 3, 이 반복되서 1 + 2 + 3 + .... 반복됨
		
		System.out.println("1~100 합 : " + sum);
	}
}
