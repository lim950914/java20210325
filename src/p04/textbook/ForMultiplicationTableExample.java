package p04.textbook;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		// 구구단
		System.out.println("구구단");
		for (int m =2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		// 2단 ~ 9단 짝수단
		System.out.println("2단 ~ 9단 짝수단");
		for (int a =2; a <= 9; a+=2) {
			System.out.println("*** " + a + "단 ***");
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + " x " + b + " = " + (a * b));
			}
		}
		// 2단 ~ 9단 *짝수
		System.out.println("2단 ~ 9단 *짝수");
		for (int c =2; c <= 9; c++) {
			System.out.println("*** " + c + "단 ***");
			for (int d = 2; d <= 9; d+= 2) {
				System.out.println(c + " x " + d + " = " + (c * d));		
			}
		}
		// 9단 ~ 2단 (9*1 ~ 9*9, 8*1 ~ 8*9, 2*1 ~ 2*9)
		System.out.println("9단 ~ 2단 (9*1 ~ 9*9, 8*1 ~ 8*9, 2*1 ~ 2*9)");
		for (int e =9; e > 1; e--) {
			System.out.println("*** " + e + "단 ***");
			for (int f =1; f <= 9; f++) {
				System.out.println(e + " x " + f + " = " + (e * f));
			}
		}
		// 9단 ~ 2단 (9*9 ~ 9*1, 8*9 ~ 8*1, 2*9 ~ 2*1)
		System.out.println("9단 ~ 2단 (9*9 ~ 9*1, 8*9 ~ 8*1, 2*9 ~ 2*1)");
		for (int g = 9; g > 1; g--) {
			System.out.println("*** " + g + "단 ***");
			for (int h = 9; h > 1; h--) {
				System.out.println(g + " x " + h + " = " + (g * h));
			}
		}
		// 2단 ~ 9단 홀수단
		System.out.println("2단 ~ 9단 홀수단");
		for (int i = 3; i <= 9 ; i+=2) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	}
}
