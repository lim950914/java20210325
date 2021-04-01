package p04.lecture;

import java.util.Scanner;

public class A20Scanner {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String d = scanner.next(); // 입력 값 만 출력함
//		String c = scanner.nextLine(); // 띄어쓰기 등 같이 출력함
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
//		System.out.println(c);
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
