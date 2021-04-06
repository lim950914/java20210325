package p05.lecture;

import java.util.Arrays;

public class A31MatrixSum {
	public static void main(String[] args) {
		int[][] mat1 = {
				{1, 2, 3},
				{5, 6, 7},
				{9, 8, 7},
				{2, 3, 4},
		};
		
		int[][] mat2 = {
				{22, 33, 44},
				{77, 88, 99},
				{3, 2, 1},
				{0, 1, 2},
		};
		
		int[][] mat3 = sum(mat1, mat2); // 미리 만든 sum에 컨트롤 + 1 하면 관련 메소드 획득
		
		for (int[] row : mat3) {
			System.out.println(Arrays.toString(row));
		}
		
	
	}

	private static int[][] sum(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length]; // a.length 4, a의 0번째 length 는 3
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	
	}
}
