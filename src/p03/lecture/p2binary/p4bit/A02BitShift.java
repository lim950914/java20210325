package p03.lecture.p2binary.p4bit;

public class A02BitShift {
	public static void main(String[] args) {
		// left shift << : 왼쪽으로 비트 이동
		//                 (오른쪽은 0으로 채움)
		
		// right shift >> : 오른쪽으로 비트 이동
		//                 (왼쪽 비트는 부호비트로 채움)
		
		// right shift >>> : 오른쪽으로 비트 이동
		//                 (왼쪽비트는 0으로 채움) 
		
		
		// left shift <<
		// 뒤에 0를 숫자만큼 추가
		int a = 99; // 0110 0011
		// a << 1   // 0 1100 0110
		int b = a << 1; // 198
		System.out.println(b);
		
		b = a << 2; // 01 1000 1100
		System.out.println(b); // 396
		
		// right shift >>
		// a        // 0110 0011
		// a >> 1   // 0011 0001
		System.out.println(a >> 1); // 49
		// a >> 2   // 0001 1000
		System.out.println(a >> 2); // 24
	}
}
