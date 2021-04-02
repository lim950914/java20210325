package p05.lecture;

import java.util.Arrays;

public class A10Array {
	// 그림 : 06.배열.png
	public static void main(String[] args) {
		// array(배열) : 여러개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
		int[] arr; // 배열도 참조타입
		arr = new int[3]; // 0부터 시작하는 3개의 배열 0 , 1 , 2 
						  
		arr[0] = 5;
		arr[1] = 7;
		// 아무 값도 지정해주지 않으면 초기값은 0 이다
		System.out.println(arr[0]); // 5
		System.out.println(arr[1]); // 7
		System.out.println(arr[2]); // 0
		
		// 한 번에 출력
		System.out.println(Arrays.toString(arr));
	}
}
