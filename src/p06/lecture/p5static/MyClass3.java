package p06.lecture.p5static;

public class MyClass3 {
	// this 는 static 메소드 앞엔 사용 불가능
	// static 메소드는 instance 메소드에서 호출가능
	// static member에서 instance member에 접근 불가능 반대인 경우는 가능
	int i;
	static int j;

	static void method1() {
		System.out.println("method1()");
//		this.method3();
		method3();
//		method4();
		System.out.println(j);
//		System.out.println(i); 스태틱에서 위에 instance 멤버 접근 불가능
	}

	static void method3() {
		System.out.println("method3()");
	}

	void method2() {
		System.out.println("method2()");
		this.method4();

		// instance member는 static member에 접근 가능
		method3();
	}

	void method4() {
		System.out.println("method4()");
	}
}
