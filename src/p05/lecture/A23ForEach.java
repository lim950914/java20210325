package p05.lecture;

public class A23ForEach {
	public static void main(String[] args) {
		// for each
		// 향상된 for문
		
		int[] arr1 = {9, 8, 7, 6,};
		
		// for
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// for each
		// arr1 이 가지고 있는 값이 int n 에서 n 에다 각 한번씩 대입되어 코드블록 실행
		// ex n 에 9 코드블록 n 에 8 코드블록 이렇게 실행
		for (int n : arr1) {
			System.out.println(n);
		}
		
	}
}
