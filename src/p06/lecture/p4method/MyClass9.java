package p06.lecture.p4method;

public class MyClass9 {
	// 리턴 타입은 메소드 오버로딩과 관련이 없음
	void method() {
		System.out.println("method()~~~");
	}
	
	void method(int i) {
		System.out.println("method(int)");
	}
	
	void method(double i) {
		System.out.println("method(double)");
	}
	
	void method(int i, int j) {
		System.out.println("method(int, int)");
	}
	
	void method(int i, String s) {
		System.out.println("method(int, String)");
	}
	
	void method(String s, int i) {
		System.out.println("method(String, int)");
	}
}





