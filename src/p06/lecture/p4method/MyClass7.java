package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1!!!");
	}
	
	void method2(int i, int j) {
		System.out.println("method2@@@");
	}
	
	// ... 여러개 받겠다는 의미
	void method3(int...i) {
		System.out.println("method3###");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	// ... 은 다른 파라미터와 같이 사용할때 앞에 올 수 없음
	void method4(double d, int...i) {
		System.out.println("method4$$$");
	}
	
}
