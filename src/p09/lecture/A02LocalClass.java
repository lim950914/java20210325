package p09.lecture;

public class A02LocalClass {
	// non-static inner class
	class Innerclass {
		
	}
	
	// static nested class
	static class NestedClass {
		
	}
	
	void method1() {
		// local class 메소드안에 정의된 클래스 메소드 안에서만 사용가능
		class LocalClass {
			// 필드
			// 생성자
			// 메소드
		}
		LocalClass o1 = new LocalClass();
	}
}
